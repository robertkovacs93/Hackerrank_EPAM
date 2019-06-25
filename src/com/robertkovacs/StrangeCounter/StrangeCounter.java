package com.robertkovacs.StrangeCounter;

public class StrangeCounter {
    public static void FiftyFourthTest() {
        long[] cases = new long[]{
                3, //1
                4, //6
                9, //1
                10, //12
                21, //1
                10000000000L
        };
        for(long l : cases) {
            long res = StrangeCounter(l);
            System.out.println("Result: " + res);
        }
    }
    static long StrangeCounter(long t) {
        // working optimal solution
        long res;
        long step = 3;
        long val = 0;
        while(val+step < t) {
            val += step;
            step *= 2;
        }
        res = val+step - t;
        return res+1;
    }
}
