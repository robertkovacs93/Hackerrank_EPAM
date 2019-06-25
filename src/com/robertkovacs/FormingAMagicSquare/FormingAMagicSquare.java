package com.robertkovacs.FormingAMagicSquare;

public class FormingAMagicSquare {
    public static void TwentySecondTest() {

        // TODO: szabályosság fedezhető fel a lehetséges megoldások között ->
        // TODO: 5 ös van a középső pozícióban minden esetben, páros szám a sarkon
        // TODO: a megoldásokat forgatva minden irányba 4 megoldás, majd tükrözve a két szélső oszlopot
        // TODO: még 4 megoldás lehetséges, így logikus egy lookup table elkészítése, és az alapján
        // TODO:  a min cost kiválasztása -> final megoldás

        int[][] s0 = new int[][]{
                {5,3,4},{1,5,8},{6,4,2}
        };
        int r0 = 7;
        int[][] s1 = new int[][]{
                {4,9,2},{3,5,7},{8,1,5}
        };
        int r1 = 1;
        int[][] s2 = new int[][]{
                {4,8,2},{4,5,7},{6,1,6}
        };
        int r2 = 4;

        int res = FormingAMagicSquare(s2);
        System.out.println("Result: " + res);
    }
    static int FormingAMagicSquare(int[][] s) {
        int cost = Integer.MAX_VALUE;
        int[][][] pSol = new int[][][]{
                {{6,1,8},{7,5,3},{2,9,4}},
                {{2,7,6},{9,5,1},{4,3,8}},
                {{4,9,2},{3,5,7},{8,1,6}},
                {{8,3,4},{1,5,9},{6,7,2}},
                {{4,3,8},{9,5,1},{2,7,6}},
                {{2,9,4},{7,5,3},{6,1,8}},
                {{6,7,2},{1,5,9},{8,3,4}},
                {{8,1,6},{3,5,7},{4,9,2}}
        };
        for(int[][] c : pSol) {
            int tempCost = 0;
            for(int i = 0; i < s.length; i++) {
                for(int j = 0; j < s[i].length; j++) {
                    tempCost += Math.abs(s[i][j] - c[i][j]);
                }
            }
            if(tempCost < cost) {
                cost = tempCost;
            }
        }
        return cost;
    }
}
