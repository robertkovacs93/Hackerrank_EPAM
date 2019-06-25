package com.robertkovacs.BeautifulDaysAtTheMovies;

public class BeautifulDaysAtTheMovies {
    public static void TwentyFourthTest() {
        int i = 20, j = 23, k = 6;
        int res = BeautifulDaysAtTheMovies(i, j, k);
        System.out.println("Result: " + res);
    }
    static int BeautifulDaysAtTheMovies(int i, int j, int k) {
        int count = 0;
        for(int start = i; start <= j; start++) {
            char[] cArr = String.valueOf(start).toCharArray();
            char[] reversed = new char[cArr.length];
            for(int x = 0; x < cArr.length; x++) {
                reversed[x] = cArr[cArr.length-1-x];
            }
            if(Math.abs(start-Integer.parseInt(String.valueOf(reversed))) % k == 0) {
                count++;
            }
        }
        return count;
    }
}
