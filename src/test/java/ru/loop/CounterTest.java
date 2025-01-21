package ru.loop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {
    @Test
    @DisplayName("When Sum  From Zero To Five Then Fifty Five")
    public void whenSumNumbersFromZeroToTenThenFiftyFive() {
        int start = 0;
        int end = 10;
        int expected = 55;
        int result = Counter.sum(start, end);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("When Sum From Fifty Five To Twenty Then Who Hundred")
    public void whenSumNumbersFromFiveToTwentyThenTwoHundred() {
        int start = 5;
        int end = 20;
        int expected = 200;
        int result = Counter.sum(start, end);
        assertThat(result).isEqualTo(expected);
    }
}
