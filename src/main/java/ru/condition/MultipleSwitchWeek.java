package ru.condition;

public class MultipleSwitchWeek {
    public static int numberOfTheDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday", "Пн", "Mon" -> 1;
            case "Вторник", "Tuesday", "Вт", "Tue" -> 2;
            case "Среда", "Wednesday", "Ср", "Wed" -> 3;
            case "Четверг", "Thursday", "Чт", "Thu" -> 4;
            case "Пятница", "Friday", "Пт", "Fri" -> 5;
            case "Суббота", "Saturday", "Сб", "Sat" -> 6;
            case "Воскресенье", "Sunday", "Вс", "Sun" -> 7;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        System.out.println(numberOfTheDay("Mon"));
    }
}
