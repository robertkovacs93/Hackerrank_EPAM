package com.robertkovacs.CircularArrayRotation;

public class CircularArrayRotation {
    public static void ThirtyFirstTest() {
        int[][] a = {{3,4,5}, {3,2,3}, {1,2,3}}; // base array
        int k[] = {2, 2, 2}; // number of right slides
        int[][] queries = {{1,2}, {0,1,2}, {0,1,2}}; // indices of the values to be returned
        for(int i = 0; i < a.length; i++) {
            int[] res = CircularArrayRotation(a[i], k[i], queries[i]);
            System.out.println("Result:");
            for(int x : res) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    static int[] CircularArrayRotation(int[] a, int k, int[] queries) {
        int[] res = new int[queries.length];
        for(int i = 0; i < k; i++) {
            int temp = a[a.length-1];
            // working solution as well but slow -> did not get accepted due to time out
//            for(int j = a.length-1; j >= 1 ; j--) {
//                a[j] = a[j-1];
//            }
//            a[0] = temp;
            if (a.length - 1 >= 0) System.arraycopy(a, 0, a, 1, a.length - 1);
            a[0] = temp;
        }
        for(int i = 0; i < queries.length; i++) {
            res[i] = a[queries[i]];
        }
        return res;
    }
}
