package com.robertkovacs.TheBombermanGame;

public class TheBombermanGame {
    public static void FiftyFifthTest() {
        String[][] gridCases = {
                {
                        "...", // O.O
                        ".O.", // ...
                        "..."  // O.O
                },
                {
                        ".......", // OOO.OOO
                        "...O...", // OO...OO
                        "....O..", // OOO...O
                        ".......", // ..OO.OO
                        "OO.....", // ...OOOO
                        "OO....."  // ...OOOO
                },
                {
                        "...", // ...
                        "O..", // O..
                        "..."  // ...
                },
                {
                        "..O", // OOO
                        "O.O", // OOO
                        "..O"  // OOO
                },
                {
                        ".O.", // ...
                        "O.O", // ...
                        ".O."  // ...
                },
                {
                        ".......", // .......
                        "...O.O.", // ...O.O.
                        "....O..", // ...OO..
                        "..O....", // ..OOOO.
                        "OO...OO", // OOOOOOO
                        "OO.O..."  // OOOOOOO
                },
                {
                        ".O.", // OOO
                        "...", // OOO
                        "O.."  // OOO
                },
                {
                        "..O" // OOO
                },
                {
                        ".", // O
                        "O", // O
                        ".", // O
                        "."  // O
                },
                {
                        "..O" //
                },
                {
                        ".",
                        "O",
                        ".",
                        "."
                }
        };
        int[] nCases = {
                3,
                3,
                1,
                2,
                9,
                5,
                656267888,
                4,
                6,
                5,
                5
        };
        for(int i = 0; i < gridCases.length; i++) {
            String[] res = TheBombermanGame(nCases[i], gridCases[i]);
            System.out.println("Result["+(i+1)+"]: ");
            for(String s : res) {
                System.out.println(s);
            }
        }
    }
    static String[] TheBombermanGame(int n, String[] grid) {
        int row = grid.length;
        int col = grid[0].length();
        char[][] r = new char[row][col];
        String[] res = new String[grid.length];
        String coords;
        // shortcut if n % 2 #case 1
        if(n == 1) {
            return grid;
        } else if(n % 2 == 0) {
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    if(res[i] == null) {
                        res[i] = "";
                    }
                    res[i] += 'O';
                }
            }
            return res;
        }
        // map arr
        coords = "";
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                char c = grid[i].charAt(j);
                r[i][j] = c;
                if(c == 'O') {
                    coords += i + "," + j + "_";
                }
            }
        }
        // plant
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                r[i][j] = 'O';
            }
        }
        // blow
        blowBomb(row, col, r, coords);
        // #case 3 returned
        if(n >= 3 && (n+1) % 4 == 0) {
            // convert to String arr
            for(int i = 0; i < row; i++) {
                res[i] = "";
                for(int j = 0; j < col; j++) {
                    if(res[i] == null) {
                        res[i] = "";
                    }
                    res[i] += r[i][j];
                }
            }
            return res;
        } else if(n > 4 && (n-1) % 4 == 0) {
            // map arr
            coords = "";
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    char c = r[i][j];
                    if(c == 'O') {
                        coords += i + "," + j + "_";
                    }
                }
            }
            // plant
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    r[i][j] = 'O';
                }
            }
            // blow
            blowBomb(row, col, r, coords);
        }
        for(int i = 0; i < row; i++) {
            res[i] = "";
            for(int j = 0; j < col; j++) {
                if(res[i] == null) {
                    res[i] = "";
                }
                res[i] += r[i][j];
            }
        }
        return res;
    }
    static void blowBomb(int row, int col, char[][] r, String coords) {
        String[] coordsA = coords.split("_"); // i,j
        for(String s : coordsA) {
            if(s.length() < 3) continue;
            String[] coordsB = s.split(",");// arr[0] = i, arr[1] = j
            int i = Integer.parseInt(coordsB[0]);
            int j = Integer.parseInt(coordsB[1]);
            r[i][j] = '.';
            if(i > 0 && i < row-1) {
                // not on top/bottom
                r[i+1][j] = '.';
                r[i-1][j] = '.';
                if(j > 0 && j < col-1) {
                    // not on left/right
                    r[i][j+1] = '.';
                    r[i][j-1] = '.';
                } else if(j == 0 && j != col-1) {
                    // on the left
                    r[i][j+1] = '.';
                } else if(j == col-1 && j != 0) {
                    // on the right
                    r[i][j-1] = '.';
                } else if(j == col -1 && j == 0) {
                    // right and left at the same time
                    // do nothing
                }
            } else if(i == 0 && i != row-1) {
                // on the top
                r[i+1][j] = '.';
                if(j > 0 && j < col-1) {
                    // not on left/right
                    r[i][j+1] = '.';
                    r[i][j-1] = '.';
                } else if(j == 0 && j != col-1) {
                    // on the left
                    r[i][j+1] = '.';
                } else if(j == col-1 && j != 0) {
                    // on the right
                    r[i][j-1] = '.';
                } else if(j == col -1 && j == 0) {
                    // right and left at the same time
                    // do nothing
                }
            } else if(i == row-1 && i != 0) {
                // at the bottom
                r[i-1][j] = '.';
                if(j > 0 && j < col-1) {
                    // not on left/right
                    r[i][j+1] = '.';
                    r[i][j-1] = '.';
                } else if(j == 0 && j != col-1) {
                    // on the left
                    r[i][j+1] = '.';
                } else if(j == col-1 && j != 0) {
                    // on the right
                    r[i][j-1] = '.';
                } else if(j == col -1 && j == 0) {
                    // right and left at the same time
                    // do nothing
                }
            } else if(i == 0 && i == row-1) {
                // bottom and top at the same time
                if(j > 0 && j < col-1) {
                    // not on left/right
                    r[i][j+1] = '.';
                    r[i][j-1] = '.';
                } else if(j == 0 && j != col-1) {
                    // on the left
                    r[i][j+1] = '.';
                } else if(j == col-1 && j != 0) {
                    // on the right
                    r[i][j-1] = '.';
                } else if(j == col -1 && j == 0) {
                    // right and left at the same time
                    // do nothing
                }
            }
        }
    }
}
