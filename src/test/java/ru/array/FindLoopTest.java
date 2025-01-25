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
}
