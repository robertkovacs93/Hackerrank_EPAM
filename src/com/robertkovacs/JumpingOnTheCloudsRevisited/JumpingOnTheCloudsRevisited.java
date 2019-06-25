package com.robertkovacs.JumpingOnTheCloudsRevisited;

public class JumpingOnTheCloudsRevisited {
    public static void TwentyEightTest() {
        int[] c0 = {0,0,1,0,0,1,1,0}; // 0 = cumulus cloud || 1 = thunderhead cloud
        int k0 = 2;
        int res0 = JumpingOnTheCloudsRevisited(c0, k0);
        System.out.println("Result0: " + res0);
        int[] c1 = {0,0,1,0}; // 0 = cumulus cloud || 1 = thunderhead cloud
        int k1 = 2;
        int res1 = JumpingOnTheCloudsRevisited(c1, k1);
        System.out.println("Result1: " + res1);
    }
    static int JumpingOnTheCloudsRevisited(int[] c, int k) {
        int e = 100;
        for(int i = 0; i < c.length; i += k) {
            e--;
            if(c[i] == 1) {
                e -= 2;
            }
        }
        return e;
    }
}
