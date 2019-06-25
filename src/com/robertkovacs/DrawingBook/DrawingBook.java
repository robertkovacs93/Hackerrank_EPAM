package com.robertkovacs.DrawingBook;

public class DrawingBook {
    public static void EighteenthTest() {
        int n = 5; // number of pages in the book
        int p = 4; // the page number to turn to
        int result = DrawingBook(n, p);
        System.out.println("Result: " + result);
    }
    static int DrawingBook(int n, int p) {
        int result = 0;
        if (p == 1 || p == n) {
            return 0;
        } else {
            if (p > (double)n/2) {
                // backward
                if (n%2 == 0) {
                    result = (int)(Math.ceil((double)n/2 - (double)p/2));
                } else {
                    result = (int)(Math.floor((double)n/2 - (double)p/2));
                }
            } else {
                // forward
                result = p/2;
            }
        }
        return result;
    }
}
