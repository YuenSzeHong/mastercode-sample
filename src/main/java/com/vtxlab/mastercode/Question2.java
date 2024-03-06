package com.vtxlab.mastercode;

public class Question2 {
    
    public int calculateTime(String keyboard, String word) {

        if (word.isEmpty()) {
            return 0;
        }

        int time = 0;
        int current = 0;

        char[] wordChars = word.toCharArray();

        for (char c : wordChars) {
            int next = keyboard.indexOf(c);
            time += Math.abs(next - current);
            current = next;
        }
        return time;
    }

}
