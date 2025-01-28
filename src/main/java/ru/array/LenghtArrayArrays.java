package ru.array;

public class LenghtArrayArrays {
    public static void main(String[] args) {
        int[][] arr = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Размер вложенного массива: " + arr[i].length);
        }
    }
}
