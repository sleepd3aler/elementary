package ru.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int i = 2; i < number - 1; i++) {
            if (number % i != 0) {
                prime = true;
                break;
            }

        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(check(5));
    }
}

