package com.robertkovacs.OrganizingContainersOfBalls;

import java.util.Arrays;

public class OrganizingContainersOfBalls {
    public static void FortiethTest() {
        int[][][] container = {
                { // possible
                        {1,1},
                        {1,1}
                },
                { // impossible
                        {0,2},
                        {1,1}
                },
                { // impossible
                        {1,3,1},
                        {2,1,2},
                        {3,3,3}
                },
                { // possible
                        {0,2,1},
                        {1,1,1},
                        {2,0,0}
                }
        };
        for(int[][] arr2d : container) {
            System.out.println(OrganizingContainersOfBalls(arr2d));
        }
    }
    static String OrganizingContainersOfBalls(int[][] container) {
        int n = container.length;
        int[] verticalSum = new int[n];
        int[] horizontalSum = new int[n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                horizontalSum[i] += container[i][j];
                verticalSum[i] += container[j][i];
            }
        }
        Arrays.sort(verticalSum);
        Arrays.sort(horizontalSum);
        for(int i = 0; i < n; i++) {
            if(horizontalSum[i] != verticalSum[i]) {
                return "Impossible";
            }
        }
        return "Possible";
    }
}
