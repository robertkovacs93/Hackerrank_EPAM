package com.robertkovacs.ViralAdvertising;

public class ViralAdvertising {
    public static void TwentyFifthTest() {
        int n = 10;
        int res = ViralAdvertising(n);
        System.out.println("Result: " + res);
    }
    static int ViralAdvertising(int n) {
        int shared = 5;
        int liked = shared/2;
        int cumulative = liked;
        for(int i = 1; i < n; i++) {
            shared = liked * 3;
            cumulative = cumulative + shared / 2;
            liked = shared / 2;
        }
        return cumulative;
    }
}
