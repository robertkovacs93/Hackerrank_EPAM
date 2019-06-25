package com.robertkovacs.BonApétit;

import java.util.Arrays;
import java.util.List;

public class BonApetit {
    public static void FifteenthTest() {
        List<Integer> bill = Arrays.asList(3, 10, 2, 9);
        int k = 1;
        int b = 7;
        BonApétit(bill, k, b);
    }
    static void BonApétit(List<Integer> bill, int k, int b) {
        int result;
        int res = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                res += bill.get(i);
            }
        }
        result = b - res/2;
        if (result == 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(result);
        }
    }
}
