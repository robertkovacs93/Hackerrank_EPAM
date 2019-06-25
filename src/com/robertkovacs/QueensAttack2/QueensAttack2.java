package com.robertkovacs.QueensAttack2;

import java.util.ArrayList;
import java.util.List;

public class QueensAttack2 {
    public static void FiftyEightTest() {

        List<Integer[][]> list = new ArrayList<>();
        int[][] params = {
                {5,3,4,3},
                {4,0,4,4},
                {1,0,1,1}
        };
        Integer[][] test1 = {
                {5,5},
                {4,2},
                {2,3}
        };
        Integer[][] test2 = {

        };
        Integer[][] test3 = {

        };

        list.add(test1);
        list.add(test2);
        list.add(test3);

        for(int i = 0; i < list.size(); i++) {
            System.out.println(queensAttack2(params[i][0], params[i][1], params[i][2], params[i][3], list.get(i)));
        }


    }
    static int queensAttack2(int n, int k, int r_q, int c_q, Integer[][] obstacles) {
        // n = length of the boards sides
        // k = number of obstacles
        // r_q = row of the queen
        // c_q = column of the queen
        // obstacles = index of the obstacles

        if(n == 1) {
            return 0;
        }
        int r = r_q, c = c_q;
        int north = n-r, south = r-1, east = n-c, west = c-1, nEast = Math.min(north, east),
                nWest = Math.min(north, west), sEast = Math.min(south, east), sWest = Math.min(south, west);
        for(Integer[] arr : obstacles) {
            int row = arr[0];
            int col = arr[1];
            if(col == c) {
                if(row > r) {
                    // north
                    north = Math.min(north, row-r-1);
                } else {
                    // south
                    south = Math.min(south, r-1-row);
                }
            }
            else if(row == r) {
                if(col > c) {
                    // east
                    east = Math.min(east, col-c-1);
                } else {
                    // west
                    west = Math.min(west, c-1-col);
                }
            }
            else if(Math.abs(row-r) == Math.abs(col-c)) {
                if(col > c) {
                    if(row > r) {
                        // north east
                        nEast = Math.min(nEast, col-c-1);
                    } else {
                        // south east
                        sEast = Math.min(sEast, col-c-1);
                    }
                } else {
                    if(row > r) {
                        // north west
                        nWest = Math.min(nWest, c-1-col);
                    } else {
                        // south west
                        sWest = Math.min(sWest, c-1-col);
                    }
                }
            }
        }
        return (north+south+east+west+nEast+nWest+sEast+sWest);
    }
}
