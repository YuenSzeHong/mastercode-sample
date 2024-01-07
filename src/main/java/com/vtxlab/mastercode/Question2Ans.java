package com.vtxlab.mastercode;

public class Question2Ans {

    public int calculateTime(String keyboard, String word) {
        if (word.length() == 0)
            return 0;

        int lastIndex = 0, currentIndex = 0, time = 0;
        int[] keyboardDict = new int[keyboard.length()];

        for (int i = 0; i < keyboardDict.length; i++) {
            keyboardDict[keyboard.charAt(i) - 'a'] = i;
        }
        for (char c : word.toCharArray()) {
            currentIndex = keyboardDict[c - 'a'];
            time += Math.abs(currentIndex - lastIndex);
            lastIndex = currentIndex;
        }
        return time;
    }

}
