package ru.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int sum = money - price;
        for (int coin : coins) {
            while (sum >= coin) {
                sum -= coin;
                result[size++] = coin;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
