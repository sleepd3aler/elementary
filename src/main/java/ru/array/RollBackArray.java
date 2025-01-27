package ru.array;

public class RollBackArray {
    public static int[] rollBack(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < result.length; index++) {
            result[index] = array[array.length - 1 - index];
        }
        return result;
    }
}
