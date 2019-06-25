package com.robertkovacs.FlatlandSpaceStation;

public class FlatlandSpaceStation {
    public static void FourteenthTest() {
        int n = 5;
        int[] c = new int[]{0,4};

        int maxLength = FlatlandSpaceStation(n, c);
        System.out.println("The max length: " + maxLength);

    }
    static int FlatlandSpaceStation(int n, int[] c) {
        // space station cords
        // n number of cities
        int maxLength = Integer.MIN_VALUE;
        int l;
        if (n == c.length) {
            return 0;
        }
        for (int i = 0; i < n; i++) {
            int temp = Integer.MAX_VALUE;
            for (int j = 0; j < c.length; j++) {
                l = i - c[j];
                if (Math.abs(l) < temp) {
                    temp = Math.abs(l);
                }
            }
            if (maxLength < temp) {
                maxLength = temp;
            }
        }
        return maxLength;
    }
}
