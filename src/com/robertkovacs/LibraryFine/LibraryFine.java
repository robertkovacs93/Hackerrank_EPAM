package com.robertkovacs.LibraryFine;

public class LibraryFine {
    public static void ThirtyFourthTest() {
        // d1 = returned day, m1 = ret month, y1 = ret year, d2,m2,y2 = due
        int[][] d1m1y1d2m2y2Params = {
                {9,6,2015,6,6,2015}, // 3day late -> 3x15 = 45 fine
                {1,1,2018,31,12,2017}, // counts as a year late -> 10000 fine
                {12,2,2015,1,1,2016}, // 0
                {12,3,2018,21,2,2018} // 1 month -> 1x500 = 500
        };
        for(int[] arr : d1m1y1d2m2y2Params) {
            int res = LibraryFine(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5]);
            System.out.println("Result: " + res);
        }
    }
    static int LibraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if(y1 == y2) {
            // less than a year
            if(m1 == m2) {
                // less than a month
                if(d1 <= d2) {
                    // brought back exactly on time or days before
                    return 0;
                } else {
                    // days late
                    return (d1-d2)*15;
                }
            } else if(m1 < m2) {
                // brought back at least 1 month earlier
                return 0;
            } else {
                // month late min
                return (m1-m2)*500;
            }
        } else if(y1 < y2) {
            // brought back at least a year before due
            return 0;
        } else {
            // fixed fine
            return 10000;
        }
    }
}
