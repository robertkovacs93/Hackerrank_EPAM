package com.robertkovacs.MatrixLayerRotation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MatrixLayerRotation {
    public static void FiftySeventhTest() {
        int[] rotations = {2, 2, 7, 3};
        List<List<List<Integer>>> params = new ArrayList<List<List<Integer>>>(){
            {
                add(new ArrayList<List<Integer>>(){{ // test 1
                    add(new ArrayList<Integer>(){{
                        add(1);add(2);add(3);add(4);
                    }});
                    add(new ArrayList<Integer>(){{
                        add(12);add(1);add(2);add(5);
                    }});
                    add(new ArrayList<Integer>(){{
                        add(11);add(4);add(3);add(6);
                    }});
                    add(new ArrayList<Integer>(){{
                        add(10);add(9);add(8);add(7);
                    }});
                }});
                add(new ArrayList<List<Integer>>(){{ // test 2
                    add(new ArrayList<Integer>(){{
                        add(1);add(2);add(3);add(4);
                    }});
                    add(new ArrayList<Integer>(){{
                        add(5);add(6);add(7);add(8);
                    }});
                    add(new ArrayList<Integer>(){{
                        add(9);add(10);add(11);add(12);
                    }});
                    add(new ArrayList<Integer>(){{
                        add(13);add(14);add(15);add(16);
                    }});
                }});
                add(new ArrayList<List<Integer>>(){{ // test 3
                    add(new ArrayList<Integer>(){{
                        add(1);add(2);add(3);add(4);
                    }});
                    add(new ArrayList<Integer>(){{
                        add(7);add(8);add(9);add(10);
                    }});
                    add(new ArrayList<Integer>(){{
                        add(13);add(14);add(15);add(16);
                    }});
                    add(new ArrayList<Integer>(){{
                        add(19);add(20);add(21);add(22);
                    }});
                    add(new ArrayList<Integer>(){{
                        add(25);add(26);add(27);add(28);
                    }});
                }});
                add(new ArrayList<List<Integer>>(){{ // test 4
                    add(new ArrayList<Integer>(){{
                        add(1);add(1);
                    }});
                    add(new ArrayList<Integer>(){{
                        add(1);add(1);
                    }});
                }});
                /*add(new ArrayList<>(){{ // test 5

                }});*/
            }
        };

        for(int i = 0; i < rotations.length; i++) {
//            if(i != 2) {
//                continue;
//            }
            MatrixLayerRotation(params.get(i), rotations[i]);
            System.out.println("\n/////////////////\n");
        }

    }
    static void MatrixLayerRotation(List<List<Integer>> matrix, int r) {
        // 2 <= m, n <= 300
        // 1 <= r <= 10^9
        // min(m, n) % 2 == 0
        // 1 <= a[i][j] <= 10^8 where i [1...m] and j [1...n]

        for(int x = 0; x < r; x++) {
            // rotate r times
            //rotateOnceV2(matrix); 44p
        }
        rotateV1(matrix, r);
        printTest57(matrix);
    }
    // working optimal solution, final version
    static void rotateV1(List<List<Integer>> matrix, int r) {
        int n = matrix.size(), m = matrix.get(0).size();
        int ringCount = Math.min(n, m) / 2;

        // create ringCount amount of linked lists to store rings
        List<LinkedList<Integer>> rings = new ArrayList<>();
        for(int i = 0; i < ringCount; i++) {
            LinkedList<Integer> l = new LinkedList<>();
            rings.add(l);
        }
        // save items in order
        int i = 0, j = 0, rInd = 0;
        for(int ring = 0; ring < ringCount; ring++) {
            // 1
            for(int x = j; x < m-j-1; x++) {
                rings.get(rInd).add(matrix.get(i).get(x));
            }
            // 2
            for(int x = i; x < n-i-1 ; x++) {
                rings.get(rInd).add(matrix.get(x).get(m-j-1));
            }
            // 3
            for(int x = m-j-1; x > j; x--) {
                rings.get(rInd).add(matrix.get(n-i-1).get(x));
            }
            // 4
            for(int x = n-i-1; x > i; x--) {
                rings.get(rInd).add(matrix.get(x).get(j));
            }
            i++; j++; rInd++;
        }
        int newIndex;
        // alter linked lists
        for(LinkedList<Integer> ll : rings) {
            int[] temp = new int[ll.size()];
            for(int x = 0; x < ll.size(); x++) {

                newIndex = x-r;
                if(newIndex < 0) {
                    newIndex = ((x-r) % ll.size())+ll.size();
                    if(newIndex == ll.size()) {
                        newIndex -= ll.size();
                    }
                }
                temp[newIndex] = ll.get(x);
            }
            ll.clear();
            for(int item : temp) {
                ll.add(item);
            }
        }
        // put linked lists altered content back
        i = 0; j = 0; rInd = 0;
        int item;
        for(int ring = 0; ring < ringCount; ring++) {
            // 1
            for(int x = j; x < m-j-1; x++) {
                item = rings.get(rInd).removeFirst();
                matrix.get(i).set(x, item);
            }
            // 2
            for(int x = i; x < n-i-1; x++) {
                item = rings.get(rInd).removeFirst();
                matrix.get(x).set(m-j-1, item);
            }
            // 3
            for(int x = m-j-1; x > j; x--) {
                item = rings.get(rInd).removeFirst();
                matrix.get(n-i-1).set(x, item);
            }
            // 4
            for(int x = n-i-1; x > i; x--) {
                item = rings.get(rInd).removeFirst();
                matrix.get(x).set(j, item);
            }
            i++; j++; rInd++;
        }
    }
    // timeout solution 44p
    static void rotateOnceV2(List<List<Integer>> matrix) {
        int n = matrix.size(), m = matrix.get(0).size();
        int ringCount = Math.min(n, m) / 2;
        int i = 0, j = 0;

        for(int r = 0; r < ringCount; r++) {
            int temp;
            int saved = matrix.get(i).get(j);
            // 1
            for(int x = j; x < m-j-1; x++) {
                temp = matrix.get(i).get(x+1);
                matrix.get(i).set(x, temp);
                matrix.get(i).set(x+1, saved);
            }
            // 2
            for(int x = i; x < n-i-1 ; x++) {
                temp = matrix.get(x+1).get(m-j-1);
                matrix.get(x).set(m-j-1, temp);
                matrix.get(x+1).set(m-j-1, saved);
            }
            // 3
            for(int x = m-j-1; x > j; x--) {
                temp = matrix.get(n-i-1).get(x-1);
                matrix.get(n-i-1).set(x, temp);
                matrix.get(n-i-1).set(x-1, saved);
            }
            // 4
            for(int x = n-i-1; x > i+1; x--) {
                temp = matrix.get(x-1).get(j);
                matrix.get(x).set(j, temp);
                matrix.get(x-1).set(j, saved);
            }
            i++; j++;
        }

    }
    static void printTest57(List<List<Integer>> list) {
        for(List<Integer> lst : list) {
            for(int a : lst) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
