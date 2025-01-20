package ru.condition;

public class AlertDivByZero {
    public static void possibleDiv(int number) {
        if (number < 0) {
            System.out.println("This is negative number");
        }
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }
    }

    public static void main(String[] args) {
        AlertDivByZero.possibleDiv(-666);
        AlertDivByZero.possibleDiv(0);
    }
}