package com.robertkovacs.AngryProfessor;

public class AngryProfessor {
    public static void TwentyThirdTest() {
        int k0 = 3; // want on time, val <= 0
        int[] a0 = {-1,-3,4,2};
        int k1 = 2;
        int[] a1 = {0,-1,2,1};
        String res = AngryProfessor(k1, a1);
        System.out.println("Result: (will cancel?) -> " + res);
    }
    static String AngryProfessor(int k, int[] a) {
        int count = 0;
        for(int num : a) {
            if(num <= 0) {
                count++;
            }
        }
        return (count>=k) ? "NO" : "YES";
    }
}
