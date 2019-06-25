package com.robertkovacs.ManasaAndStones;

import java.util.Arrays;

public class ManasaAndStones {
    public static void FiftySecondTest() {
        int[][] cases = { // cases[0] = n, cases[1] = a, cases[2] = b
                {3,2,3}, // 4,5,6
                {3,1,2}, // 2,3,4
                {4,10,100}, // 30,120,210,300
                {7,9,11}, // 54,56,58,60,62,64,66
                {4,8,16} // 24,32,40,48
        };
        for(int[] c : cases) {
            System.out.print("Result: ");
            int[] res = ManasaAndStones(c[0], c[1], c[2]);
            if(res != null) {
                for(int val : res) {
                    System.out.print(val + " ");
                }
            }
            System.out.println();
        }
    }
    static int[] ManasaAndStones(int n, int a, int b) {
        // n = stones found, a = possible diff1, b = possible diff2
        if(a > b) {
            int temp = a;
            a = b;
            b = temp;
        } else if (a == b) {
            return new int[]{a * (n-1)};
        }
        int[] res = new int[n];
        for(int i = 0; i < n; i++) {
            // asc
            int p0 = a * ((n - 1) - i);
            int p1 = b * i;
            res[i] = p0 + p1;
        }
        Arrays.sort(res);
        return res;
    }
}
