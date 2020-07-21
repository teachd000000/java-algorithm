package com.teachd.algorithm;

import org.junit.Test;

import java.util.List;

import static com.teachd.algorithm.LinearSearchQuestion.linearSearch;
import static com.teachd.algorithm.LinearSearchQuestion.linearSearch2;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LinearSearchQuestionTest {

    @Test
    public void testLinearSearch() {
        assertThat(linearSearch(2, List.of(2, 3, 5, 7, 11))).isEqualTo(0);
        assertThat(linearSearch(0, List.of(2, 3, 5, 7, 11))).isEqualTo(-1);
        assertThat(linearSearch(5, List.of(2, 3, 5, 7, 11))).isEqualTo(2);
        assertThat(linearSearch(3, List.of(2, 3, 5, 7, 11))).isEqualTo(1);
        assertThat(linearSearch(11, List.of(2, 3, 5, 7, 11))).isEqualTo(4);
    }

    @Test
    public void testLinearSearch2() {
        assertThat(linearSearch2(2, List.of(2, 3, 5, 7, 11))).isEqualTo(0);
        assertThat(linearSearch2(0, List.of(2, 3, 5, 7, 11))).isEqualTo(-1);
        assertThat(linearSearch2(5, List.of(2, 3, 5, 7, 11))).isEqualTo(2);
        assertThat(linearSearch2(3, List.of(2, 3, 5, 7, 11))).isEqualTo(1);
        assertThat(linearSearch2(11, List.of(2, 3, 5, 7, 11))).isEqualTo(4);
    }
}