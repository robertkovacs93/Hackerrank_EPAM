package com.robertkovacs.DayOfTheProgrammer;

public class DayOfTheProgrammer {
    public static void SeventeenthTest() {
        int year = 2000;
        String res = DayOfTheProgrammer(year);
        System.out.println("result: " + res);
    }
    static String DayOfTheProgrammer(int year) {
        int dayOfTheProgrammer = 256;
        String result = "";
        int day;
        int feb = 28;
        if (year > 1918) {
            // greg
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                // greg leap year
                day = dayOfTheProgrammer - (31 + (feb + 1) + 31 + 30 + 31 + 30 + 31 + 31);
                result += day + "." + "09." + year;
            } else {
                // not leap year
                day = dayOfTheProgrammer - (31 + feb + 31 + 30 + 31 + 30 + 31 + 31);
                result += day + "." + "09." + year;
            }
        } else if (year < 1918) {
            if (year % 4 == 0) {
                // jul leap year
                day = dayOfTheProgrammer - (31 + (feb + 1) + 31 + 30 + 31 + 30 + 31 + 31);
                result += day + "." + "09." + year;
            } else {
                // not leap year
                day = dayOfTheProgrammer - (31 + feb + 31 + 30 + 31 + 30 + 31 + 31);
                result += day + "." + "09." + year;
            }
        } else {
            // jul -> greg
            feb = 15;
            day = dayOfTheProgrammer - (31 + feb + 31 + 30 + 31 + 30 + 31 + 31);
            result += day + "." + "09." + year;
        }
        return result;
    }
}
