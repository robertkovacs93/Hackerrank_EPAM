package com.robertkovacs.ServiceLane;

public class ServiceLane {
    public static void FiftiethTest() {
        System.out.println("TEST 1:");
        int[] w = {2,3,1,2,3,2,3,3};
        int[][] cases = {
                {0,3}, // 1
                {4,6}, // 2
                {6,7}, // 3
                {3,5}, // 2
                {0,7}  // 1
        };
        int[] result = ServiceLane(w.length, cases, w);
        for(int x : result) {
            System.out.println("Result: " + x);
        }
        System.out.println("TEST 2:");
        int[] w1 = {1,2,2,2,1};
        int[][] cases1 = {
                {2,3}, // 2
                {1,4}, // 1
                {2,4}, // 1
                {2,4}, // 1
                {2,3}  // 2
        };
        int[] result1 = ServiceLane(w1.length, cases1, w1);
        for(int x : result1) {
            System.out.println("Result: " + x);
        }
    }
    static int[] ServiceLane(int n, int[][] cases, int[] w) {
        int[] res = new int[cases.length];
        for(int i = 0; i < cases.length; i++) {
            int min = w[cases[i][0]]; // starting index val
            for(int j = cases[i][0]; j <= cases[i][1]; j++) {
                if(w[j] < min) { // finding min val from start index to end index
                    min = w[j];
                }
            }
            res[i] = min; // put min val into res array
        }
        return res;
    }
}
