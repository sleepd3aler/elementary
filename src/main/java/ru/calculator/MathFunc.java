package ru.calculator;

public class MathFunc {
    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int result1 = func1(3);
        int result2 = func2(5);
        int total = result1 + result2;
        int result3 = func1(100);
        System.out.println(result3);
    }
}
