package ru.condition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {
    @Test
    @DisplayName("Triangle exists")
    void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("Triangle not exists")
    void whenNotExist() {
        double ab = 0.0;
        double ac = 0.0;
        double bc = 0.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }
}
