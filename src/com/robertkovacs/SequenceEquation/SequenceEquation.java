package com.robertkovacs.SequenceEquation;

public class SequenceEquation {
    public static void TwentySeventhTest() {
        int[] p0 = {5,2,1,3,4};
        int[] p1 = {2,3,1};
        int[] p2 = {4,3,5,1,2};
        int[] res0 = SequenceEquation(p0);
        int[] res1 = SequenceEquation(p1);
        int[] res2 = SequenceEquation(p2);
        System.out.print("Result0:");
        for(int n : res0) {
            System.out.print(" " + n);
        }
        System.out.println();
        System.out.print("Result1:");
        for(int n : res1) {
            System.out.print(" " + n);
        }
        System.out.println();
        System.out.print("Result2:");
        for(int n : res2) {
            System.out.print(" " + n);
        }
    }
    static int[] SequenceEquation(int[] p) {
        int[] res = new int[p.length];
        int x = 1;
        while(x <= p.length) {
            int ind = 0;
            for(int i = 0; i < p.length; i++) {
                if(p[i] == x) {
                    ind = i+1;
                    break;
                }
            }
            for(int i = 0; i < p.length; i++) {
                if(p[i] == ind) {
                    res[x-1] = i+1;
                    break;
                }
            }
            x++;
        }
        return res;
    }
}
