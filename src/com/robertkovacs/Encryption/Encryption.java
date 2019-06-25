package com.robertkovacs.Encryption;

public class Encryption {
    public static void FortyFirstTest() {
        String[] s = {
                "if man was meant to stay on the ground god would have given us roots", // L=54, 7row 8col
                "hello guys from here", // L=17, 4row 5col
                "have a nice day",
                "feed the dog",
                "chill out"
        };
        for(String str : s) {
            System.out.println("Result: " + Encryption(str));
        }
    }
    static String Encryption(String s) {
        String res = "";
        String procTxt = "";
        for(String str : s.split(" ")) {
            procTxt += str;
        }
        int row = (int)Math.floor(Math.sqrt(procTxt.length()));
        int col = (int)Math.ceil(Math.sqrt(procTxt.length()));
        if(row*col < procTxt.length()) {
            row++;
        }
        for(int i = 0; i < col; i++) {
            for(int j = 0; j < row; j++) {
                if(col*j+i < procTxt.length()) {
                    res += procTxt.charAt((col*j) + i);
                }
            }
            res += " ";
        }
        return res;
    }
}
