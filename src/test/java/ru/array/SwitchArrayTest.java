package ru.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = new int[]{1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = new int[]{4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap1to2() {
        int[] input = new int[]{1, 2, 3, 4};
        int source = 1;
        int dest = input.length / 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = new int[]{1, 3, 2, 4};
        assertThat(result).containsExactly(expected);
    }
}
