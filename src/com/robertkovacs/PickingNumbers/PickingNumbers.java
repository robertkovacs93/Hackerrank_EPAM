package com.robertkovacs.PickingNumbers;

import java.util.Arrays;
import java.util.List;

public class PickingNumbers {
    public static void TwentiethTest() {
        List<Integer> a0 = Arrays.asList(1,2,4); // 2
        List<Integer> a1 = Arrays.asList(1,2); // 2
        List<Integer> a2 = Arrays.asList(1,1,2,2,4,4,5,5,5); // 5
        List<Integer> a3 = Arrays.asList(4,6,5,3,3,1); // 3
        List<Integer> a4 = Arrays.asList(1,2,2,3,1,2); // 5
        int result = PickingNumbers(a2);
        System.out.println("Result: " + result);
    }
    static int PickingNumbers(List<Integer> a) {
        int count = 1;
        if (a.size() == 2) {
            return 2;
        }
        for (int i = 0; i < a.size(); i++) {
            int temp = 1;
            int secNum = -1;
            for (int j = 0; j < a.size(); j++) {
                if (Math.abs(a.get(i) - a.get(j)) <= 1 && i != j) {
                    if (secNum < 0) {
                        secNum = a.get(j);
                        temp++;
                    } else if (a.get(j) == secNum || a.get(j).equals(a.get(i))) {
                        temp++;
                    }
                }
            }
            if (temp > count) {
                count = temp;
            }
        }
        return count;
    }
}
