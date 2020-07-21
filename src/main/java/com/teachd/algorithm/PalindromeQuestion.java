package com.teachd.algorithm;

public class PalindromeQuestion {

    private PalindromeQuestion() {
    }

    public static boolean isPalindrome(final String text) {
        final String reverseText = new StringBuilder(text).reverse().toString();
        return text.equals(reverseText);
    }
}
