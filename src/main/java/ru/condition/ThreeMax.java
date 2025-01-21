package ru.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first > second && first > third) {
            result = first;
        }
        if (second > first && second > third) {
            result = second;
        }
        if (third > second && third > first) {
            result = third;
        } else result = Math.max(result, third);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(1, 2, 3));
    }
}


