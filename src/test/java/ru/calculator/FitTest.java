package ru.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static ru.calculator.Fit.manWeight;
import static ru.calculator.Fit.womanWeight;

class FitTest {

    @Test
    void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = manWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short in = 170;
        double expected = 69;
        double out = womanWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}
