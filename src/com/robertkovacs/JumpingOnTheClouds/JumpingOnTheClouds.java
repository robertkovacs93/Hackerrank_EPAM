package com.robertkovacs.JumpingOnTheClouds;

public class JumpingOnTheClouds {
    public static void ThirtySeventhTest() {
        // jump can be 1 or 2 cloud
        int[][] c = {
                {0,1,0,0,0,1,0}, // 3
                {0,0,1,0,0,1,0}, // 4
                {0,0,0,0,1,0} // 3
        };
        for(int[] arr : c) {
            int res = JumpingOnTheClouds(arr);
            System.out.println("Result: " + res);
        }
    }
    static int JumpingOnTheClouds(int[] c) {
        int jumps = -1;
        int i = 0;
        while(i <= c.length-1) {
            if(i+2 <= c.length-1) {
                if(c[i+2] == 0) {
                    i += 2;
                } else {
                    i++;
                }
                jumps++;
            } else {
                i++;
                jumps++;
            }
        }
        return jumps;
    }
}
