package ru.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first > second ? first : second > third ? second : third;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(1, 5, 3));
    }
}


