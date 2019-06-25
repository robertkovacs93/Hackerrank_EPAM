package com.robertkovacs.FindDigits;

public class FindDigits {
    public static void TwentyNinthTest() {
        int d0 = 1012;
        int res0 = FindDigits(d0);
        System.out.println("Result0: " + res0);
        int d1 = 12;
        int res1 = FindDigits(d1);
        System.out.println("Result1: " + res1);
        int d2 = 1012;
        int res2 = FindDigits(d2);
        System.out.println("Result2: " + res2);
    }
    static int FindDigits(int d) {
        int count = 0;
        String dStr = String.valueOf(d);
        for(int i = 0; i < dStr.length(); i++) {
            int x = Integer.parseInt(dStr.charAt(i)+"");
            if(x != 0 && d % x == 0) {
                count++;
            }
        }
        return count;
    }
}
