package com.robertkovacs.AbsolutePermutation;

public class AbsolutePermutation {
    public static void NinthTest() {
        int n = 4; // max pos
        int k = 2; // abs diff
        int[] result = AbsolutePermutation(n, k);
        for (int x : result) {
            System.out.println("Perm: " + x);
        }
    }
    static int[] AbsolutePermutation(int n, int k) {
        int[] pos = new int[n];
        int[] perm;
        int x = k;
        // pos: 1 2 3 4
        // perm: 3 4 1 2
        // diff: 2 2 2 2
        for (int i = 0; i < pos.length; i++) {
            pos[i] = (i + 1);
        }
        if (k == 0) {
            perm = pos;
            return perm;
        } else if (n % (2*k) == 0) {
            perm = new int[n];
            for (int i = 1; i <= n; i++) {
                perm[i-1] = i + x;
                if (i % k == 0) {
                    x *= -1;
                }
            }
            return perm;
        } else {
            perm = new int[1];
            perm[0] = -1;
            return perm;
        }
    }
}
