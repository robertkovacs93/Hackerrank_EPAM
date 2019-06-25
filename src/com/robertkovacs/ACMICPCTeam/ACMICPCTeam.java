package com.robertkovacs.ACMICPCTeam;

public class ACMICPCTeam {
    public static void ThirtyEightTest() {
        String[][] topics = {
                {"10101","11110","00010"}, // 5,1
                {"10101","11100","11010","00101"} // 5,2
        };
        for(String[] s : topics) {
            int[] res = ACMICPCTeam(s);
            System.out.print("Result: ");
            for(int i : res) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    static int[] ACMICPCTeam(String[] topic) {
        int maxTopics = 0;
        int countOfMaxTopic = 0;

        int ind1 = 0;
        int ind2 = 1;
        while(true) {
            int countTemp = 0;
            for(int j = 0; j < topic[ind1].length(); j++) {
                if(topic[ind1].charAt(j) == '1' || topic[ind2].charAt(j) == '1') {
                    countTemp++;
                }
            }
            if (countTemp > maxTopics) {
                maxTopics = countTemp;
                countOfMaxTopic = 1;
            } else if (countTemp == maxTopics) {
                countOfMaxTopic++;
            }
            if(ind1 == topic.length-2 && ind2 == topic.length-1) {
                break;
            }
            if(ind2 == topic.length-1) {
                ind1++;
                ind2 = ind1+1;
            } else {
                ind2++;
            }
        }
        return new int[]{maxTopics, countOfMaxTopic};
    }
}
