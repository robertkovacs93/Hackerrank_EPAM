package com.robertkovacs.UtopianTree;

public class UtopianTree {
    public static void SixthTest() {
        int cycle = 4;
        int treeHeight = UtopianTree(cycle);
        System.out.println("Final height: " + treeHeight);
    }
    static int UtopianTree(int n) {
        int treeSize = 1;
        boolean cycleSwap = true;
        for (int i = 0; i < n; i++) {
            if (cycleSwap) {
                treeSize *= 2;
                cycleSwap = false;
            } else {
                treeSize += 1;
                cycleSwap = true;
            }
        }
        return treeSize;
    }
}
