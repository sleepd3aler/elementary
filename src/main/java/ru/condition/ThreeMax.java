package ru.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second > first) {
            result = second;
        }
        if (third > result) {
            result = third;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(1, 2, 3));
    }
}


