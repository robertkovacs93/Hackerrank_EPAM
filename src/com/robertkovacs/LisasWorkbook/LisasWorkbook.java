package com.robertkovacs.LisasWorkbook;

public class LisasWorkbook {
    public static void FiftyFirstTest() {
        int[] ns = {5};
        int[] ks = {3};
        int[][] arrs = {
                {4,2,6,1,10}
        };
        for(int i = 0; i < ns.length; i++) {
            int res = LisasWorkbook(ns[i], ks[i], arrs[i]);
            System.out.println("Result: " + res);
        }
    }
    static int LisasWorkbook(int n, int k, int[] arr) {
        // n = number of chapter, k = maximum number of problems/page
        int page = 1, count = 0;
        for(int i =  0; i < n; i++) {
            // i = chapter
            // arr[i] problem number in this chapter
            for(int j = 1; j <= arr[i]; j++) {
                if(j == page) {
                    count++;
                }
                if(j % k == 0 || j == arr[i]) {
                    page++;
                }
            }
        }
        return count;
    }
}
