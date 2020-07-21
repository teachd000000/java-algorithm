package com.teachd.algorithm;

import org.junit.Test;

import static com.teachd.algorithm.PalindromeQuestion.isPalindrome;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PalindromeQuestionTest {

    @Test
    public void testIsPalindrome() {
        assertThat(isPalindrome("racecar")).isTrue();
        assertThat(isPalindrome("stars")).isFalse();
        assertThat(isPalindrome("토마토")).isTrue();
        assertThat(isPalindrome("kayak")).isTrue();
        assertThat(isPalindrome("hello")).isFalse();
    }
}