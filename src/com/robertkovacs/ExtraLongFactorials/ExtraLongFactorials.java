package com.robertkovacs.ExtraLongFactorials;

import java.math.BigInteger;

public class ExtraLongFactorials {
    public static void ThirtiethTest() {
        int n = 25;
        ExtraLongFactorials(n);
    }
    static void ExtraLongFactorials(int n) {
        BigInteger bInt = BigInteger.ONE;
        BigInteger mult;
        for(int i = 1; i <= n; i++) {
            mult = new BigInteger(String.valueOf(i));
            bInt = bInt.multiply(mult);
        }
        System.out.println(bInt.toString());
    }
}
