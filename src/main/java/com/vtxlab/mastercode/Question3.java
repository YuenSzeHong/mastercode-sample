package com.vtxlab.mastercode;

import java.util.HashMap;
import java.util.Map;

public class Question3 {

    public int[] anagramMappings(int[] nums1, int[] nums2) {
        Map<Integer,Integer> indesxMap = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            indesxMap.put(nums2[i], i);
        }

        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            result[i] = indesxMap.get(nums1[i]);
        }

        return result;
    }
    
}
