package com.robertkovacs.SaveThePrisoner;

public class SaveThePrisoner {
    public static void TwentySixthTest() {
        // n = number of prisoners, m = number of sweets, s = starting seat
        int[] n = {5,7,3,1,7};
        int[] m = {2,19,7,213,2};
        int[] s = {1,2,3,1,7};
        // TODO: exp: 2,6,3,1,1
        for(int i = 0; i < n.length; i++) {
            System.out.println("Result" + i + ": " + SaveThePrisoner(n[i],m[i],s[i]));
        }
    }
    static int SaveThePrisoner(int n, int m, int s) {
        if(n == 1) {
            return 1;
        }
        int x = (s - 1) + m;
        if(x > n) {
            if(x % n == 0) {
                return n;
            } else {
                return x % n;
            }
        } else {
            return x;
        }
    }
}
