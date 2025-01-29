package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        SortSelected.sort(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
