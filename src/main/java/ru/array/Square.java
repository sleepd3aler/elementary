package ru.array;

public class Square {
    public static int[] calculate(int bound) {
        return new int[bound];
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            array[index] = (int) Math.pow(index, 2);
        }
        for (int square : array) {
            System.out.println(square);
        }
    }
}
