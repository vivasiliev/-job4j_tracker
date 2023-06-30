package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Ivanov Ivan Ivanovich");
        student.setGroup("R108");
        student.setDate(new Date());
        System.out.println(student.getFio() + "\n" + student.getGroup() + "\n" + student.getDate());
    }
}
