package ru.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] array = new int[bound];
        for (int index = 0; index < array.length; index++) {
            array[index] = (int) Math.pow(index, 2);
        }
        return array;
    }

    public static void main(String[] args) {
        for (int square : calculate(4)) {
            System.out.println(square);
        }
    }
}

