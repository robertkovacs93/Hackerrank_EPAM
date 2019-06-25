package com.robertkovacs.BeautifulTriplets;

public class BeautifulTriplets {
    public static void FortySixthTest() {
        int[] ds = {1, 3};
        int[][] arrs = {
                {2, 2, 3, 4, 5}, // 3
                {1, 2, 4, 5, 7, 8, 10} // 3
        };
        for(int i = 0; i < arrs.length; i++) {
            int res = BeautifulTriplets(ds[i], arrs[i]);
            System.out.println("Result: " + res);
        }
    }
    static int BeautifulTriplets(int d, int[] arr) {
        // arr[j] - arr[i] = arr[k] - arr[j] = d && i < j < k
        int count = 0;
        for(int i = 0; i < arr.length-2; i++) {
            for(int j = i+1; j < arr.length-1; j++) {
                int lp = arr[j] - arr[i];
                if(lp != d) {
                    continue;
                }
                for(int k = j+1; k < arr.length; k++) {
                    int rp = arr[k] - arr[j];
                    if(lp == rp) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
