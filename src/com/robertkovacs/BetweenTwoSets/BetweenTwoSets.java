package com.robertkovacs.BetweenTwoSets;

import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {
    public static void TwelfthTest() {
        int[] a = new int[] {2, 6};
        int[] b = new int[] {24, 36};
        int result = BetweenTwoSets(a, b);
        System.out.println("Result: " + result);
    }
    static int BetweenTwoSets(int[] a, int[] b) {
        int bMin = Integer.MAX_VALUE;
        int aMax = Integer.MIN_VALUE;
        int count = 0;
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            if (bMin > b[i]) {
                bMin = b[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (aMax < a[i]) {
                aMax = a[i];
            }
        }
        int num = aMax;
        while (num <= bMin) {
            int cB = 0;
            int cA = 0;
            for (int i = 0; i < a.length; i++) {
                if (num % a[i] == 0) {
                    cA++;
                }
            }
            for (int i = 0; i < b.length; i++) {
                if (b[i] % num == 0) {
                    cB++;
                }
            }
            if (cB == b.length && cA == a.length) {
                count++;
                temp.add(num);
            }
            num = num + aMax;
        }
        for (int i : temp) {
            System.out.println(i);
        }
        return count;
    }
}
