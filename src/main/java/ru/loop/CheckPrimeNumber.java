package ru.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1 || number % 2 == 0;

        for (int i = 2; i < number; i++) {
            if (number % 2 == 0) {
                prime = false;
                break;
            }

        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(check(5));
    }
}

