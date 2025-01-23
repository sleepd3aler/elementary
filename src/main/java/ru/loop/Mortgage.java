package ru.loop;

public class Mortgage {
    public static int year(double amount, int selary, double percent) {
        int year = 0;
        while (amount > 0) {
            if (percent < 1) {
                percent *= 100;
            }
            amount += amount * percent / 100;
            amount -= selary;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(year(100, 120, 0.5));
    }
}
