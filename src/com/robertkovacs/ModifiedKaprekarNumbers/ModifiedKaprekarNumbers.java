package com.robertkovacs.ModifiedKaprekarNumbers;

public class ModifiedKaprekarNumbers {
    public static void FortyThirdTest() {
        int[] p = {1,2,100,0, 100},
                q = {100,3,300,1, 100000};
        for(int i = 0; i < p.length; i++) {
            ModifiedKaprekarNumbers(p[i], q[i]);
        }

    }
    static void ModifiedKaprekarNumbers(int p, int q) {
        System.out.print("Modified Kaprekar numbers from " + p + " to " + q + ": ");
        long temp;
        int count = 0;
        for(int i = p; i <= q; i++) {
            if(i == 1) {
                System.out.print(i + " ");
                continue;
            } else if(i == 0 || i == 2 || i == 3) {
                if(i == q && count == 0) {
                    System.out.print("INVALID RANGE");
                }
                continue;
            }
            temp = (long)i*i;
            String iStr = String.valueOf(i);
            String tempStr = String.valueOf(temp);
            int iLen = iStr.length();
            int tempLen = tempStr.length();
            int boundary = tempLen-iLen;
            String left = tempStr.substring(0, boundary);
            String right = tempStr.substring(boundary);

            int leftNum = Integer.parseInt(left);
            int rightNum = Integer.parseInt(right);
            if(leftNum + rightNum == i && leftNum != 0 && rightNum != 0) {
                System.out.print(i + " ");
                count++;
            }
            if(i == q && count == 0) {
                System.out.print("INVALID RANGE");
            }
        }
        System.out.println();
    }
}
