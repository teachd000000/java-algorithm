package com.teachd.algorithm;

import org.junit.Test;

import static com.teachd.algorithm.BinarySearchQuestion.binarySearch;
import static com.teachd.algorithm.BinarySearchQuestion.binarySearchRecursively;
import static org.assertj.core.api.Assertions.assertThat;

public class BinarySearchQuestionTest {

    @Test
    public void testBinarySearch() {
        final int[] array = {2, 3, 5, 7, 11};
        final int first = 0;
        final int last = array.length;

        assertThat(binarySearch(2, array, first, last)).isEqualTo(0);
        assertThat(binarySearch(0, array, first, last)).isEqualTo(-1);
        assertThat(binarySearch(5, array, first, last)).isEqualTo(2);
        assertThat(binarySearch(3, array, first, last)).isEqualTo(1);
        assertThat(binarySearch(11, array, first, last)).isEqualTo(4);
    }

    @Test
    public void testBinarySearchRecursively() {
        final int[] array = {2, 3, 5, 7, 11};
        final int first = 0;
        final int last = array.length;

        assertThat(binarySearchRecursively(2, array, first, last)).isEqualTo(0);
        assertThat(binarySearchRecursively(0, array, first, last)).isEqualTo(-1);
        assertThat(binarySearchRecursively(5, array, first, last)).isEqualTo(2);
        assertThat(binarySearchRecursively(3, array, first, last)).isEqualTo(1);
        assertThat(binarySearchRecursively(11, array, first, last)).isEqualTo(4);
    }
}