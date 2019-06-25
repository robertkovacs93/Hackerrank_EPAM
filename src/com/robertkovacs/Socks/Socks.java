package com.robertkovacs.Socks;

import java.util.HashMap;
import java.util.Map;

public class Socks {
    public static void SeventhTest() {
        int n = 9;
        int[] array = new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int pairs = Socks(n, array);
        System.out.println("Number of pairs:" + pairs);

    }
    static int Socks(int n, int[] arr) {
        int pair = 0;
        Map<Integer, Integer> x = new HashMap<>(); // key = type 1 <= t <= 100 | value = count
        for (int i = 0; i < arr.length; i++) {
            x.put(arr[i], x.getOrDefault(arr[i], 0) + 1);
        }
        for (int i : x.values()) {
            pair += i/2;
        }
        return pair;
    }
}
