package com.vtxlab.mastercode;

public class Question1Ans {

    public String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }

}
