package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SquareTest {

    @Test
    void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expect = new int[]{0, 1, 4};
        assertThat(result).containsExactly(expect);
    }

    @Test
    void whenBound5Then014916() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expect = new int[]{0, 1, 4, 9, 16};
        assertThat(result).containsExactly(expect);
    }
}
