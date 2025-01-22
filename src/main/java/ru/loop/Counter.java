package ru.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sumEven = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            }
        }
        return sumEven;
    }
    
}
