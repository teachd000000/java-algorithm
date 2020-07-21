package com.teachd.algorithm;

import org.junit.Test;

import static com.teachd.algorithm.LinearSearchQuestion.linearSearch;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LinearSearchQuestionTest {

    @Test
    public void testLinearSearch() {
        final int[] array = {2, 3, 5, 7, 11};

        assertThat(linearSearch(2, array)).isEqualTo(0);
        assertThat(linearSearch(0, array)).isEqualTo(-1);
        assertThat(linearSearch(5, array)).isEqualTo(2);
        assertThat(linearSearch(3, array)).isEqualTo(1);
        assertThat(linearSearch(11, array)).isEqualTo(4);
    }
}