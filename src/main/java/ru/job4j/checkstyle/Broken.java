package ru.job4j.checkstyle;

public class Broken {
    String name;
    public String surname;

    Broken() {
    }

    public static final String newValue() {
        return "";
    }

    void echo() {
    }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    void method(int a, int b, int c, int d, int e, int f) {
    }

    private int sizeOfEmpty = 10;
}
