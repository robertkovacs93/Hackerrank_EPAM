package com.robertkovacs.RepeatedString;

public class RepeatedString {
    public static void ThirtySixthTest() {
        String[] s = {"abcac","aba","a","aaabbbaabb","aaabbbbbbaabbab","asdda"};
        long[] n = {10,10,1000000000, 10, 10, 1000000000000L};
        // 4,7,1000000000,
        for(int i = 0; i < s.length; i++) {
            long result = RepeatedString(s[i], n[i]);
            System.out.println("Result: " + result);
        }
    }
    static long RepeatedString(String s, long n) {
        char givenChar = 'a';
        long aInString = s.chars().filter(c -> c == givenChar).count();
        if(s.length() == 1 && s.charAt(0) == givenChar) {
            return n;
        } else if(s.length() == 1 && s.charAt(0) != givenChar) {
            return 0;
        }
        if(n == s.length()) {
            return s.chars().filter(c -> c == givenChar).count();
        } else if(n < s.length()) {
            return s.substring(0, (int)n).chars().filter(c -> c == givenChar).count();
        } else {
            long res = n / s.length() * aInString;
            if(n % s.length() == 0) {
                return res;
            } else {
                return res + s.substring(0, (int)(n % s.length())).chars().filter(c -> c == givenChar).count();
            }
        }
    }
}
