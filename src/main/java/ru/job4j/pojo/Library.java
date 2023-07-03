package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book animals = new Book("Animals", 12);
        Book people = new Book("People", 16);
        Book space = new Book("Space", 30);
        Book cleanCode = new Book("Clean code", 50);
        Book[] books = new Book[4];
        books[0] = animals;
        books[1] = people;
        books[2] = space;
        books[3] = cleanCode;
        for (int index = 0; index < books.length; index++) {
            Book pr = books[index];
            System.out.println(pr.getName() + " - " + pr.getCount());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println("Меняем местами элементы массива");
        for (int index = 0; index < books.length; index++) {
            Book pr = books[index];
            System.out.println(pr.getName() + " - " + pr.getCount());
        }
        System.out.println("Находим книгу Clean code");
        for (int index = 0; index < books.length; index++) {
            Book pr = books[index];
            if ("Clean code".equals(pr.getName())) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            }
        }
    }
}
