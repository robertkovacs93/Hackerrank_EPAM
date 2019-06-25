package com.robertkovacs.CavityMap;

public class CavityMap {
    public static void FortyFifthTest() {
        String[][] grids = {
                {
                        "989", // 989
                        "191", // 1X1
                        "111"  // 111
                },
                {
                        "1112", // 1112
                        "1912", // 1X12
                        "1892", // 18X2
                        "1234"  // 1234
                }
        };
        for(String[] grid : grids) {
            String[] res = CavityMap(grid);
            System.out.println("Result grid:");
            for(String row : res) {
                System.out.println(row);
            }
        }
    }
    static String[] CavityMap(String[] grid) {
        String[] resultGrid = new String[grid.length];
        if(grid.length <= 2) {
            return grid;
        }
        for(int i = 0; i < grid.length; i++) {
            resultGrid[i] = "";
            for(int j = 0; j < grid[i].length(); j++) {
                int depth = Integer.parseInt(grid[i].toCharArray()[j]+"");
                int depthN = Integer.MAX_VALUE;
                int depthS = Integer.MAX_VALUE;
                int depthW = Integer.MAX_VALUE;
                int depthE = Integer.MAX_VALUE;
                if((i != 0 && i != grid.length-1) && (j != 0 && j != grid[i].length()-1)) {
                    depthN = Integer.parseInt(grid[i-1].toCharArray()[j]+"");
                    depthS = Integer.parseInt(grid[i+1].toCharArray()[j]+"");
                    depthW = Integer.parseInt(grid[i].toCharArray()[j-1]+"");
                    depthE = Integer.parseInt(grid[i].toCharArray()[j+1]+"");
                }
                if(depth > depthN && depth > depthS && depth > depthW && depth > depthE) {
                    resultGrid[i] += "X";
                } else {
                    resultGrid[i] += depth;
                }
            }
        }
        return resultGrid;
    }
}
