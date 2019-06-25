package com.robertkovacs.FairRations;

public class FairRations {
    public static void FortyFourthTest() {
        int[][] Bs = {
                {4,5,6,7},
                {2,3,4,5,6},
                {1,2},
                {1,3},
                {2,4},
                {1,1,1,1,2},
                {1,1,1,1,2,3},
                {1,1,1,1,2,3,2},
                {1,1,1,1,2,3,2,3}
        };
        for(int[] B : Bs) {
            System.out.print("Result: ");
            int res = FairRations(B);
            System.out.print(res);
            System.out.println();
        }
    }
    static int FairRations(int[] B) {
        int breadCount = 0;
        int oddCount = 0;
        for (int i = 0; i < B.length; i++) {
            if (B[i] % 2 != 0) {
                oddCount++;
            }
        }
        if(oddCount % 2 != 0) {
            System.out.print("NO");
            return -1;
        } else {
            // we can start incrementing values
            for(int i = 0; i < B.length; i++) {
                if(B[i] % 2 != 0) {
                    if(i == 0) {
                        // only i+1 available to add to
                        B[i] = B[i]+1;
                        B[i+1] = B[i+1]+1;
                    } else if (i == B.length-1) {
                        // only i-1 available to add to
                        B[i] = B[i]+1;
                        B[i-1] = B[i-1]+1;
                    } else {
                        // can be added to i+1 || i-1
                        if(B[i+1] % 2 != 0) {
                            B[i] = B[i]+1;
                            B[i+1] = B[i+1]+1;
                        } else if(B[i-1] % 2 != 0) {
                            B[i] = B[i]+1;
                            B[i-1] = B[i-1]+1;
                        } else {
                            B[i] = B[i]+1;
                            B[i+1] = B[i+1]+1;
                        }
                    }
                    breadCount += 2;
                }
            }
        }
        return breadCount;
    }
}
