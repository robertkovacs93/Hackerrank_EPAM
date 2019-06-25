package com.robertkovacs.CutTheSticks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutTheSticks {
    public static void ThirtyFifthTest() {
        int[][] arrParams = {
                {1,2,3,4,3,3,2,1}, // 8,6,4,1
                {5,4,4,2,2,8}, // 6,4,2,1
                {1,2,3}, // 3,2,1
                {2,2,2,2,2,2}, // 6
                {2,2,2,1,1,1}, // 6,3
                {2,2,2,1}, // 4,3
                {1}, // 1
                {4,4,3,3,2,2,1,1}, // 8,6,4,2
                {}, // blank
                {}
        };
        for(int[] arr : arrParams) {
            int[] res = CutTheSticks(arr);
            for(int n : res) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
    static int[] CutTheSticks(int[] arr) {
        if(arr.length == 0) {
            return new int[]{};
        } else if (arr.length == 1) {
            return new int[]{1};
        }
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        list.add(arr.length);
        int index = 1;
        int minVal = arr[0];
        while(true) {
            if(minVal == arr[index]) {
                if(index+1 != arr.length-1) {
                    index++;
                } else {
                    if(arr[arr.length-1] == minVal) {
                        break;
                    } else {
                        list.add(arr.length-index-1);
                    }
                    break;
                }
            } else if(minVal < arr[index]) {
                minVal = arr[index];
                list.add(arr.length-index);
                if(index+1 != arr.length-1) {
                    index++;
                } else {
                    if(arr[arr.length-1] == minVal) {
                        break;
                    } else {
                        list.add(arr.length-index-1);
                    }
                    break;
                }
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
