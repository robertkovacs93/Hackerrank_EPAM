package com.robertkovacs.DiagonalDifferences;

public class DiagonalDifferences {
    public static void SecondTest(){
        int[][] array2 = new int[][]{{11,2,4}, {4,5,6}, {10,8,-12}};
        int result = 15;
        // 3
        // 11 2 4
        // 4 5 6
        // 10 8 -12
        int i = DiagonalDifferences(array2);
        if (i != 15) {
            System.out.println("Error");
            System.out.println("Your output: " + i);
            System.out.println("Expected output: " + result);
        } else {
            System.out.println("Correct!!!");
        }
    }

    static int DiagonalDifferences(int[][] arr) {
        int n = arr.length - 1;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i <= n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[n-i][i];
        }
        return Math.abs(sum1-sum2);
    }
}
