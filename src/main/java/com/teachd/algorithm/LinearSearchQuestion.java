package com.teachd.algorithm;

import java.util.List;

public class LinearSearchQuestion {

    private LinearSearchQuestion() {
    }

    public static int linearSearch(final int element, final List<Integer> list) {
        return list.indexOf(element);
    }
}
