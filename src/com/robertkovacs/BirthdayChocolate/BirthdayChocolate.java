package com.robertkovacs.BirthdayChocolate;

import java.util.Arrays;
import java.util.List;

public class BirthdayChocolate {
    public static void ThirteenthTest() {
        int d = 3;
        int m = 2;

        int d0 = 4;
        int m0 = 2;

        int d1 = 3;
        int m1 = 2;

        int d2 = 4;
        int m2 = 1;

        int dCust = 15;
        int mCust = 3;

        List<Integer> s = Arrays.asList(1, 2, 1, 3, 2);
        List<Integer> s0 = Arrays.asList(2, 2, 1, 3, 2);
        List<Integer> s1 = Arrays.asList(1, 1, 1, 1, 1, 1);
        List<Integer> s2 = Arrays.asList(4);
        List<Integer> sCust = Arrays.asList(5, 5, 5, 3, 5, 5, 5);
        int result = BirthdayChocolate(sCust, dCust, mCust);
        System.out.println("Combinations: " + result);
    }
    static int BirthdayChocolate(List<Integer> s, int d, int m) {
        int sum = 0;
        int count = 0;
        int index = 0;
        int cycle = 0;
        while (index < s.size()) {
            sum += s.get(index);
            index++;
            cycle++;
            if (cycle == m) {
                if (sum == d) {
                    count++;
                }
                cycle = 0;
                index -= (m-1);
                sum = 0;
            }
        }
        return count;
    }
}
