package com.robertkovacs.AppendAndDelete;

public class AppendAndDelete {
    public static void ThirtySecondTest() {
        String[] s = {"abc", "hackerhappy", "aba", "ashley", "short", "", "empty", "asdasd"};
        String[] t = {"def", "hackerrank", "aba", "ash", "shortyguy", "empty", "", "cccccc"};
        int[] k = {6, 9, 7, 2, 4, 5, 3, 12};
        for(int i = 0; i < s.length; i++) {
            String res = AppendAndDelete(s[i], t[i], k[i]);
            System.out.println("Result: " + res + " " + k[i] + " " + t[i]);
        }
    }
    static String AppendAndDelete(String s, String t, int k) {
        int opCount;
        int i = 0;
        if(s == null) {
            s = "";
        }
        if(t == null) {
            t = "";
        }
        if(s.length()+t.length() <= k) {
            return "Yes";
        }
        for(; i < s.length() && i < t.length(); i++) {
            if(s.charAt(i) != t.charAt(i)) {
                break;
            }
        }
        opCount = (s.length()-i) + (t.length() - i);
        System.out.print("opCount["+ opCount +"] ");
        return (k >= opCount && (k - opCount) % 2 == 0) ? "Yes" : "No";
    }
}
