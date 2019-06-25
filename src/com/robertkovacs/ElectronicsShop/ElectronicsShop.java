package com.robertkovacs.ElectronicsShop;

public class ElectronicsShop {
    public static void NineteenthTest() {
        int[] keyboards = {4};
        int[] drives = {5};
        int b = 5;
        int result = ElectronicsShop(keyboards, drives, b);
        System.out.println("Result: " + result);
    }
    static int ElectronicsShop(int[] keyboards, int[] drives, int b) {
        int result = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                int temp = keyboards[i] + drives[j];
                if (temp <= b && temp > result) {
                    result = temp;
                }
            }
        }
        return result;
    }
}
