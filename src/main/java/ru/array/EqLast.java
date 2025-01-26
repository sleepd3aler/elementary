package ru.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = true;
        for (int index = 0; index < right.length; index++) {
            result = left[left.length - 1] == right[right.length - 1];
        }
        return result;
    }
}
