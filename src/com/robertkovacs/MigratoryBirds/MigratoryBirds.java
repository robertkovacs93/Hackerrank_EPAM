package com.robertkovacs.MigratoryBirds;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
    public static void SixteenthTest() {
        List<Integer> arr = Arrays.asList(1, 4, 4, 4, 5, 3);
        int result = MigratoryBirds(arr);
        System.out.println("result: " + result);
    }
    static int MigratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int resIndex = 0;
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > res) {
                res = e.getValue();
                resIndex = e.getKey();
            }
        }
        return resIndex;
    }
}
