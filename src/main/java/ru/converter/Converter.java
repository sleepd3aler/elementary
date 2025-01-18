package ru.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 100;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 90;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 1.4f;
        float expectedInDollars = 1.5555556f;
        float out = Converter.rubleToEuro(in);
        float outInDollars = rubleToDollar(in);
        boolean passed = expected == out;
        boolean passedInDollars = expectedInDollars == outInDollars;
        System.out.println("140 rubles are 1.4. Test result : " + passed);
        System.out.println("140 rubles are 1.5555556. Test result : " + passedInDollars);
    }
}

