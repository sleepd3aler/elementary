package ru.calculator;

public class ArgMethod {

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        ArgMethod.hello("Java", 6);
        ArgMethod.hello("Java", 6);
        ArgMethod.hello("Java", 6);
        ArgMethod.hello("Java", 6);
    }
}
