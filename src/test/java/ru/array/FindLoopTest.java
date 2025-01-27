package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expect = 0;
        assertThat(result).isEqualTo(expect);
    }

    @Test
    public void whenArrayHas3Then2() {
        int[] data = new int[]{5, 10, 3};
        int el = 3;
        int result = FindLoop.indexOf(data, el);
        int expect = 2;
        assertThat(result).isEqualTo(expect);
    }

    @Test
    public void whenArrayHas2ThenMinus1() {
        int[] data = new int[]{5, 10, 3};
        int el = 2;
        int result = FindLoop.indexOf(data, el);
        int expect = -1;
        assertThat(result).isEqualTo(expect);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = new int[]{5, 10, 3, 4, 6, 7, 8, 11, 12, 13};
        int el = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expect = -1;
        assertThat(result).isEqualTo(expect);
    }

    @Test
    public void whenDiapasonHas8Then8() {
        int[] data = new int[]{5, 10, 3, 4, 6, 7, 8, 11, 12, 13};
        int el = 8;
        int start = 3;
        int finish = 8;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expect = 6;
        assertThat(result).isEqualTo(expect);

    }
}


