package ru.loop;

public class Mortgage {
    public static int year(double amount, int selary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount = amount + percent;
            amount -= selary;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(year(100, 120, 50));
    }
}
