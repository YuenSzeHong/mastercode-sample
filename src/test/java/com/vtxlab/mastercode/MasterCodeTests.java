package com.vtxlab.mastercode;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MasterCodeTests {

    private static Question1 question1;
    private static Question2 question2;
    private static Question3 question3;

    @BeforeAll
    public static void init() {
        question1 = new Question1();
        question2 = new Question2();
        question3 = new Question3();
    }

    @Test
    public void question1Case1() {
        String result = question1.removeVowels("leetcodeisacommunityforcoders");
        assertThat(result, is("ltcdscmmntyfrcdrs"));
    }

    @Test
    public void question1Case2() {
        String result = question1.removeVowels("aeiou");
        assertThat(result, is(""));
    }

    @Test
    public void question2Case1() {
        int result = question2.calculateTime("abcdefghijklmnopqrstuvwxyz", "cba");
        assertThat(result, is(4));
    }

    @Test
    public void question2Case2() {
        int result = question2.calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode");
        assertThat(result, is(73));
    }

    @Test
    public void question3Case1() {
        int[] result = question3.anagramMappings(new int[] { 12, 28, 46, 32, 50 }, new int[] { 50, 12, 32, 46, 28 });
        assertThat(result, is(new int[] { 1, 4, 3, 2, 0 }));
    }

    @Test
    public void question3Case2() {
        int[] result = question3.anagramMappings(new int[] { 84, 46 }, new int[] { 84, 46 });
        assertThat(result, is(new int[] { 0, 1 }));
    }

}
