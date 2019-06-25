package com.robertkovacs.Kangaroo;

public class Kangaroo {
    public static void EleventhTest() {
        int x1 = 2;
        int v1 = 1;
        int x2 = 1;
        int v2 = 2;
        String result = Kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
    static String Kangaroo(int x1, int v1, int x2, int v2) {
        int k1 = x1 + v1;
        int k2 = x2 + v2;
        while (k1 >= 0) {
            if (k1 == k2) {
                return "YES";
            } else {
                k1 += v1;
                k2 += v2;
                if ((k2 > k1 && v2 > v1) || (k1 > k2 && v1 > v2)) {
                    return "NO";
                }
            }
        }
        return "NO";
    }
}
