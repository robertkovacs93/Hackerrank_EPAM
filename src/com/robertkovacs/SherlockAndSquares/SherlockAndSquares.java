package com.robertkovacs.SherlockAndSquares;

public class SherlockAndSquares {
    public static void ThirtyThirdTest() {
        int[] a = {3,17,24,35,100};
        int[] b = {9,24,49,70,1000};
        for(int i = 0; i < a.length; i++) {
            int res = SherlockAndSquares(a[i], b[i]);
            System.out.println("Result: " + res);
        }
    }
    static int SherlockAndSquares(int a, int b) {
        // not optimal, time out solution
//        int[] digSums = {1,4,7,9};
//        int[] perREndings = {0,1,4,5,6,9};
//        int count = 0;
//        for(double i = a; i <= b; i++) {
//            int digitSum = (int)i;
//            char[] num = String.valueOf(i).toCharArray();
//            boolean valid = false;
//            for(int j = 0; j < perREndings.length; j++) {
//                if(Integer.parseInt(num[num.length-3]+"") == perREndings[j]) {
//                    valid = true;
//                }
//            }
//            if(valid) {
//                while(String.valueOf(digitSum).length() > 1) {
//                    char[] temp = String.valueOf(digitSum).toCharArray();
//                    digitSum = 0;
//                    for (char c : temp) {
//                        digitSum += Integer.parseInt(c + "");
//                    }
//                }
//                if(digitSum == digSums[0] || digitSum == digSums[1] || digitSum == digSums[2] ||
//                        digitSum == digSums[3]) {
//                    if(Math.sqrt(i) % 1 == 0) {
//                        count++;
//                    }
//                }
//            }
//        }
//        return count;

        return (int)(Math.floor(Math.sqrt(b))-Math.ceil(Math.sqrt(a)) + 1);
    }
}
