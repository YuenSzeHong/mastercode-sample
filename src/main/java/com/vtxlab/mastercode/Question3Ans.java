package com.vtxlab.mastercode;

public class Question3Ans {

    public int[] anagramMappings(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result[i] = j;
                    break;
                }
            }
        }
        return result;
    }

}
