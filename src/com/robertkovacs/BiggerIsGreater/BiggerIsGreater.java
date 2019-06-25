package com.robertkovacs.BiggerIsGreater;

public class BiggerIsGreater {
    public static void FortySecondTest() {
        String[] params = {
                "abcd", // abdc
                "ab", // ba
                "bb", // no answer
                "hefg", // hegf
                "dhck", // dhkc
                "dkhc", // hcdk
                "lmno", // lmon
                "dcba", // no answer
                "dcbb", // no answer
                "abdc", // acbd
                "abcd", // abdc
                "fedcbabcd", // fedcbabdc
                "a" // no answer
        };
        for(String s : params) {
            System.out.println("Result: " + BiggerIsGreater(s));
        }
    }
    static String BiggerIsGreater(String w) {
        char[] result = w.toCharArray();
        int charToSwapInd = result.length-1;
        int x = charToSwapInd;
        // char to swap on the left side, correct its right side
        for(; charToSwapInd > 0 && result[charToSwapInd - 1] >= result[charToSwapInd]; charToSwapInd--);
        if(charToSwapInd <= 0) {
            // there is no available solution
            return "no answer";
        }
        for(; result[x] <= result[charToSwapInd-1]; x--);
        // perform the swapping
        char temp = result[charToSwapInd-1];
        result[charToSwapInd-1] = result[x];
        result[x] = temp;
        // correct the chars after the swapped char
        for(x = result.length-1; charToSwapInd < x; charToSwapInd++, x--) {
            temp = result[charToSwapInd];
            result[charToSwapInd] = result[x];
            result[x] = temp;
        }
        return String.valueOf(result);
    }
}
