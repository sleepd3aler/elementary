package ru.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static ru.converter.Converter.rubleToDollar;
import static ru.converter.Converter.rubleToEuro;

class ConverterTest {

    @Test
    void whenConvert140RblThen1Dot4Euro() {
        float in = 140;
        float expectedInEuros = 1.4f;
        float outInEuros = rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(outInEuros).isEqualTo(expectedInEuros, withPrecision(eps));
    }

    @Test
    void whenConvert140RblThen1dot5555Dlr() {
        float in = 140;
        float expectedInDollars = 1.5555f;
        float outInDollars = rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(outInDollars).isEqualTo(expectedInDollars, withPrecision(eps));
    }

    @Test
    void whenConvert0RblThen0Dollar() {
        float in = 0;
        float expectedInDollars = 0;
        float outInDollars = rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(outInDollars).isEqualTo(expectedInDollars, withPrecision(eps));
    }

    @Test
    void whenConvertMinus150EurosThenMinus1dot5Euro() {
        float in = -150;
        float expectedInEuros = -1.5f;
        float outInEuros = rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(outInEuros).isEqualTo(expectedInEuros, withPrecision(eps));
    }

    @Test
    void whenConvert275EurosThen2dot7Euro() {
        float in = 275;
        float expectedInEuros = 2.7f;
        float outInEuros = rubleToEuro(in);
        float eps = 0.1f;
        assertThat(outInEuros).isEqualTo(expectedInEuros, withPrecision(eps));
    }
}