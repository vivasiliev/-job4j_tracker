package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Ivanov Ivan Ivanovich");
        student.setGroup("R108");
        student.setDate(new Date());
        String ln = System.lineSeparator();
        System.out.println(student.getFio() + ln + student.getGroup() + ln + student.getDate());
    }
}
