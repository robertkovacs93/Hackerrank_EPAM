package com.robertkovacs.DesignerPDFViewer;

public class DesignerPDFViewer {
    public static void TwentyFirstTest() {
        int[] h1 = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        int[] h2 = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
        String word = "zaba";
        int result = DesignerPDFViewer(h2, word);
        System.out.println("Result: " + result);
    }
    static int DesignerPDFViewer(int[] h, String word) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        int max = 0;
        for (int i = 0; i < word.length(); i++) {
            int index = 0;
            for (int j = 0; j < abc.length(); j++) {
                if (word.charAt(i) == abc.charAt(j)) {
                    index = j;
                }
            }
            if (max < h[index]) {
                max = h[index];
            }
        }
        return word.length()*max;
    }
}
