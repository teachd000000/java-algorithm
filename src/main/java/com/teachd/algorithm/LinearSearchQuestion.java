package com.teachd.algorithm;

public class LinearSearchQuestion {

    private LinearSearchQuestion() {
    }

    public static int linearSearch(final int element, final int[] array) {
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != element) continue;
            result = i;
        }
        return result;
    }
}
