package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TurnTest {
    @Test
    void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expect = new int[]{2, 6, 1, 4};
        assertThat(result).containsExactly(expect);
    }

    @Test
    void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = Turn.back(input);
        int[] expect = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertThat(result).containsExactly(expect);
    }
}


