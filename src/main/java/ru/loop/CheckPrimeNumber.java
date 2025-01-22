package ru.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int i = 1; i < Math.sqrt(number); i++) {
            if (number % i != 0 || number == 2) {
                prime = true;
                break;
            }

        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(check(2));
    }
}

