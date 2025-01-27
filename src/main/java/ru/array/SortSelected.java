package ru.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) { // проходим по массиву
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int indexOfMin = FindLoop.indexInRange(data, min, i, data.length - 1);
            if (data[indexOfMin] < data[i]) {
                int temp = data[i];
                data[i] = data[indexOfMin];
                data[indexOfMin] = temp;
            }
        }
        return data;
    }
}
