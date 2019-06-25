package com.robertkovacs.PlusMinus;

public class PlusMinus {
    public static void ThirdTest() {
        int[] array = new int[] {-4, 3, -9, 0, 4, 1};
        PlusMinus(array);
    }
    static void PlusMinus(int[] arr) {
        int pos = 0;
        int neg = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos++;
            } else if (arr[i] < 0) {
                neg++;
            } else {
                zero++;
            }
        }
        double posRate = (double)pos/arr.length;
        double negRate = (double)neg/arr.length;
        double zeroRate = (double)zero/arr.length;

        System.out.format("%f\n", posRate);
        System.out.format("%f\n", negRate);
        System.out.format("%f\n", zeroRate);
    }
}
