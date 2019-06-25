package com.robertkovacs.EqualizeArr;

public class EqualizeArr {
    public static void EighthTest() {
        int[] array = new int[]{1, 2};
        int result = EqualizeArr(array);
        System.out.println(result);
    }
    static int EqualizeArr(int[] arr) {
        int maxCount = 0; // item count
        for (int j = 0; j < arr.length; j++) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return arr.length - maxCount;
    }
}
