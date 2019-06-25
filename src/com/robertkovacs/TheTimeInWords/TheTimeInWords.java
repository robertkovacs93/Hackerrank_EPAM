package com.robertkovacs.TheTimeInWords;

public class TheTimeInWords {
    public static void FortyEightTest() {
        int[] hs = {5,5,5,5,5,5,5,5,5};
        int[] ms = {0,1,10,15,30,40,45,47,28};
        for(int i = 0; i < hs.length; i++) {
            String res = TheTimeInWords(hs[i], ms[i]);
            System.out.println("Time: h-[" + hs[i] + "] m-[" + ms[i] + "] String: " + res);
        }
    }
    static String TheTimeInWords(int h, int m) {
        StringBuilder res = new StringBuilder();
        int hToConvert = h;
        if(m == 0) {
            res.append(StringifyNumber(hToConvert));
            res.append(" o' clock");
        } else if(m == 15) {
            res.append("quarter past ");
            res.append(StringifyNumber(hToConvert));
        } else if(m >= 1 && m < 30) {
            res.append(StringifyNumber(m));
            if(m == 1) {
                res.append(" minute past ");
            } else {
                res.append(" minutes past ");
            }
            res.append(StringifyNumber(hToConvert));
        } else if(m == 30) {
            res.append("half past ");
            res.append(StringifyNumber(hToConvert));
        } else if(m > 30 && m != 45) {
            hToConvert++;
            res.append(StringifyNumber((60-m)));
            if(60-m == 1) {
                res.append(" minute to ");
            } else {
                res.append(" minutes to ");
            }
            res.append(StringifyNumber(hToConvert));
        } else if(m == 45) {
            hToConvert++;
            res.append("quarter to ");
            res.append(StringifyNumber(hToConvert));
        }
        return res.toString();
    }
    static String StringifyNumber(int num) {
        String result = "";
        if(num > 20) {
            result = "twenty ";
        } else if(num == 20) {
            result = "twenty";
        }
        switch(num) {
            case 1: case 21: result += "one";
                break;
            case 2: case 22: result += "two";
                break;
            case 3: case 23: result += "three";
                break;
            case 4: case 24: result += "four";
                break;
            case 5: case 25: result += "five";
                break;
            case 6: case 26: result += "six";
                break;
            case 7: case 27: result += "seven";
                break;
            case 8: case 28: result += "eight";
                break;
            case 9: case 29: result += "nine";
                break;
            case 10: result = "ten";
                break;
            case 11: result = "eleven";
                break;
            case 12: result = "twelve";
                break;
            case 13: result = "thirteen";
                break;
            case 14: result = "fourteen";
                break;
            case 16: result = "sixteen";
                break;
            case 17: result = "seventeen";
                break;
            case 18: result = "eighteen";
                break;
            case 19: result = "nineteen";
                break;
        }
        return result;
    }
}
