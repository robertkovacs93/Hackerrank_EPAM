package com.robertkovacs.RoundGrades;

public class RoundGrades {
    public static void FifthTest() {
        int[] array = new int[]{4, 73, 67, 38, 33};

        int[] result = RoundGrades(array);
        System.out.println("Before rounding:");
        for (int g : array) {
            System.out.println(g);
        }
        System.out.println("After rounding:");
        for (int g : result) {
            System.out.println(g);
        }
    }
    static int[] RoundGrades(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 37) {
                if ((arr[i] + 1) % 5 == 0) {
                    res[i] = arr[i] + 1;
                } else if ((arr[i] + 2) % 5 == 0) {
                    res[i] = arr[i] + 2;
                } else {
                    res[i] = arr[i];
                }
            } else {
                res[i] = arr[i];
            }
        }
        return res;
    }
}
