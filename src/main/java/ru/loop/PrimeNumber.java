package ru.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(calc(11));
    }
}
