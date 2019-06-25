package com.robertkovacs.LarrysArray;

public class LarrysArray {
    public static void FiftySixthTest() {
        int[][] AArr = {
                {3, 1, 2}, // YES
                {1, 3, 4, 2}, // YES
                {1, 2, 3, 5, 4}, // NO
                {1,6,5,2,4,3}, // YES
                {1,6,5,2,3,4}, // NO
                {7,11,8,13} // NO
        };
        for(int[] A : AArr) {
            String res = LarrysArray(A);
            System.out.print("arr: [");
            for(int x : A) {
                System.out.print(x);
            }
            System.out.print("] -> ");
            System.out.print(res + "\n");
        }
    }
    static String LarrysArray(int[] A) {
        // ABC -> BCA -> CAB -> ABC
        // 3 <= n <= 1000
        // a[i] <= 1 <= n LOOKS LIKE DEAR AUTHOR FORGOT THIS WHEN HE WROTE TEST CASES

        int count = 0;
        for(int i = 1; i < A.length; i++) {
            int sortedInd = A[i];
            int j = i-1;

            while(j >= 0 && A[j] > sortedInd) {
                A[j+1] = A[j];
                j = j-1;
                count++;
            }
            A[j+1] = sortedInd;
        }
        return count % 2 == 0 ? "YES" : "NO";
    }
}
