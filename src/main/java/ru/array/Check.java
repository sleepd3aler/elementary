package ru.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
            data[0] = result;
            result = data[0] == data[index];
        }
        return result;
    }
}
