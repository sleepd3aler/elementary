package ru.calculator;

import static ru.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(second, first);
    }

    public static double sumAndDivide(double first, double second) {
        return divide(first, second)
                + difference(first, second);
    }

    public static double sumOfAll(double first, double second) {
        return sum(first, second)
                + difference(first, second)
                + divide(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета суммы умножения равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета суммы деления и вычитания равен: " + sumAndDivide(10, 20));
        System.out.println("Результат расчета суммы вычисления всех операций равен: " + sumOfAll(10, 20));

    }
}
