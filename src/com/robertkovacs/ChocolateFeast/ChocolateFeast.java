package com.robertkovacs.ChocolateFeast;

public class ChocolateFeast {
    public static void FortyNinthTest() {
        int[][] cases = {
                {15, 3, 2}, // 9
                {10, 2, 5}, // 6
                {12, 4, 4}, // 3
                {6, 2, 2}, // 5
                {7, 3, 2} // 3
        };
        for(int[] a : cases) {
            int res = ChocolateFeast(a[0], a[1], a[2]);
            System.out.println("Result: " + res);
        }
    }
    static int ChocolateFeast(int n, int c, int m) {
        int count = n/c;
        int wrapper = count;
        while(true) {
            if(wrapper/m > 0) {
                count += wrapper/m;
                wrapper = wrapper/m + wrapper%m;
            } else {
                break;
            }
        }
        return count;
    }
}
