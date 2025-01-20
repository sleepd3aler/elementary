package ru.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return num % 2 != 0;
    }

    public static boolean notPositive(int num) {
        return num < 0;
    }

    public static boolean notEvenAndPositive(int num) {
        return num % 2 != 0 && num > 0;
    }

    public static boolean evenOrNotPositive(int num) {
        return num % 2 == 0 || num < 0;
    }

    public static void main(String[] args) {
        boolean isEven = isEven(4);
        System.out.println(isEven);
        boolean isPositive = isPositive(4);
        System.out.println(isPositive);
        boolean notEven = notEven(3);
        System.out.println(notEven);
        boolean notPositive = notPositive(-666);
        System.out.println(notPositive);
        boolean notEvenAndPositive = notEvenAndPositive(5);
        System.out.println(notEvenAndPositive);
        boolean evenOrNotPositive = evenOrNotPositive(-3);
        System.out.println(evenOrNotPositive);
    }
}

