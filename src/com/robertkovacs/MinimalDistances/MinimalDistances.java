package com.robertkovacs.MinimalDistances;

public class MinimalDistances {
    public static void FortySeventhTest() {
        int[][] as = {
                {3, 2, 1, 2, 3}, // 2
                {7, 1, 3, 4, 1, 7}, // 3
                {1, 2, 3, 4, 5, 6}, // -1
                {1} // -1
        };
        for(int[] a : as) {
            int res = MinimumDistances(a);
            System.out.println("Result: " + res);
        }
    }
    static int MinimumDistances(int[] a) {
        int minDist = Integer.MAX_VALUE;
        if(a.length == 1) {
            return -1;
        }
        for(int i = 0; i < a.length-1; i++) {
            for(int j = i+1; j < a.length; j++) {
                if(a[i] == a[j]) {
                    int dist = Math.abs(i-j);
                    if(dist < minDist) {
                        minDist = dist;
                    }
                }
            }
        }
        return minDist < Integer.MAX_VALUE ? minDist : -1;
    }
}
