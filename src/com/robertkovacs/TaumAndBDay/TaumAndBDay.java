package com.robertkovacs.TaumAndBDay;

public class TaumAndBDay {
    public static void ThirtyNinthTest() {
        int[][] params = {
                {3,5,3,4,1}, // 29
                {10,10,1,1,1}, // 20
                {5,9,2,3,4}, // 37
                {3,6,9,1,1}, // 12
                {7,7,4,2,1}, // 35
                {3,3,1,9,2} // 12
        };
        for(int[] arr : params) {
            long res = TaumAndBDay(arr[0],arr[1],arr[2],arr[3],arr[4]);
            System.out.println("Result: " + res);
        }
    }
    static long TaumAndBDay(long b, long w, long bc, long wc, long z) {
        if((bc+z) < wc && bc < wc) {
            // buy black instead of white then convert them to white
            return (b*bc)+(w*bc)+(w*z);
        } else if((wc+z) < bc && wc < bc) {
            // buy white instead of black then convert them to black
            return (b*wc)+(w*wc)+(b*z);
        } else {
            // buy for original prices
            return (b*bc) + (w*wc);
        }
    }
}
