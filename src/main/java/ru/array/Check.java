package ru.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 1; index < data.length; index++) {
            data[0] = result;
            if (data[0] == data[index]) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
}
