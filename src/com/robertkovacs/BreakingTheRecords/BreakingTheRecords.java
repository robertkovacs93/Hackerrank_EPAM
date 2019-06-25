package com.robertkovacs.BreakingTheRecords;

public class BreakingTheRecords {
    public static void TenthTest() {
        int[] array = new int[] { 3, 4, 21, 36, 10, 28, 35, 5, 24, 42 };
        int result[] = BreakingTheRecords(array);
        for (int x : result) {
            System.out.println(x + " ");
        }
    }
    static int[] BreakingTheRecords(int[] scores) {
        int minBreak = 0;
        int maxBreak = 0;

        int currMin = 0;
        int currMax = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > scores[currMax]) {
                currMax = i;
                maxBreak++;
            }
            if (scores[i] < scores[currMin]) {
                currMin = i;
                minBreak++;
            }
        }
        return new int[]{ maxBreak, minBreak};
    }
}
