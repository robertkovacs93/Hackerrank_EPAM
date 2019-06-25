package com.robertkovacs.HappyLadybugs;

import java.util.HashMap;
import java.util.Map;

public class HappyLadybugs {
    public static void FiftyThirdTest() {
        String[] cases = new String[]{
                "RBY_YBR", //yes
                "X_Y__X", //no
                "__", //yes
                "B_RRBR", //yes
                "AABBC", //no
                "AABBC_C", //yes
                "_", //yes
                "DD__FQ_QQF", //yes
                "AABCBC", //no
                "A", //no
                "AA", //yes
                "AB" //no
        };
        for(String b : cases) {
            String res = HappyLadybugs(b);
            System.out.println("Result ["+b+"]: " + res);
        }
    }
    static String HappyLadybugs(String b) {
        if((b.length() == 1 && b.charAt(0) != '_') ||
                (b.length() == 2 && b.charAt(0) != b.charAt(1))) {
            return "NO";
        } else if(b.length() == 1 && b.charAt(0) == '_') {
            return "YES";
        }
        Map<Character, Integer> m = new HashMap<>();
        boolean h = true;
        for(int i = 0; i < b.length(); i++) {
            char curr = b.charAt(i);
            if(i < b.length()-1 && i > 0) {
                char left = b.charAt(i-1);
                char right = b.charAt(i+1);
                if(curr != '_' && (curr != left && curr != right)) {
                    h = false;
                }
            } else if(i == 0) {
                char right = b.charAt(i+1);
                if(curr != '_' && (curr != right)) {
                    h = false;
                }
            } else if(i == b.length()-1) {
                char left = b.charAt(i-1);
                if(curr != '_' && (curr != left)) {
                    h = false;
                }
            }
            m.put(b.charAt(i), m.getOrDefault(b.charAt(i), 0) + 1);
        }
        if(!h && m.getOrDefault('_', 0) == 0) return "NO";
        for(Map.Entry<Character, Integer> e : m.entrySet()) {
            if(e.getValue() == 1 && e.getKey() != '_') {
                return "NO";
            }
        }
        return "YES";
    }
}
