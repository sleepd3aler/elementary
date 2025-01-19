package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static ru.condition.Point.distance;

public class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    //
    @Test
    void when00toMinus50then5() {
        double expected = 5;
        int x1 = 0;
        int y1 = 0;
        int x2 = -5;
        int y2 = 0;
        double out = distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when22to22then0() {
        double expected = 0;
        int x1 = 2;
        int y1 = 2;
        int x2 = 2;
        int y2 = 2;
        double out = distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when10to00Then1() {
        double expected = 1;
        int x1 = 1;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double out = distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}
