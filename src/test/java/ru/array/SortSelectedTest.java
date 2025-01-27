package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayOf3Elements() {
        int[] data = new int[]{4, 5, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{2, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayOf5Elements() {
        int[] data = new int[]{1, 5, 2, 666, 666};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 5, 666, 666};
        assertThat(result).containsExactly(expected);
    }
}

