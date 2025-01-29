package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MatrixCheckTest {
    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNoMonoArray() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {'X', 'X', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isFalse();
    }

    @Test
    public void whenMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int row = 2;
        boolean result = MatrixCheck.monoVertical(input, row);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNoMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', ' '},
        };
        int row = 2;
        boolean result = MatrixCheck.monoVertical(input, row);
        assertThat(result).isFalse();
    }
}
