package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int sum = array[left] + array[right];
            if (sum == target) {
                return new int[]{left, right};
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }

        }
        return new int[0];
    }
}
