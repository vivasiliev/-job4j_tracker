package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int y) {
        return x * y;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return minus(y) + sum(y) + divide(y) + multiply(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sumAllOperation(3));
        System.out.println(sum(2));
        System.out.println(calculator.multiply(3));
        System.out.println(minus(4));
        System.out.println(calculator.divide(5));
    }
}
