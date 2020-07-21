package com.teachd.algorithm;

import java.util.List;

public class LinearSearchQuestion {

    private LinearSearchQuestion() {
    }

    public static int linearSearch(final int element, final List<Integer> list) {
        return list.indexOf(element);
    }

    public static int linearSearch2(final int element, final List<Integer> list) {
        int result = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != element) {
                result = i;
                break;
            }
        }
        return result;
    }
}
