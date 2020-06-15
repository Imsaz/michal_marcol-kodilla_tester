package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Cris More", null));
        list.add(new Student("Betty Forrester", new Teacher("SJ Butterfly")));
        list.add(new Student("Ann Potter", new Teacher("LJ Claus")));
        list.add(new Student("Carl Jung", null));
        list.add(new Student("Simon Attic", new Teacher("Edward Moore")));

        for (Student student : list) {
            var studentName = Optional.ofNullable(student).map(Student::getName).orElse("<undefined>");
            var teacherName = Optional.ofNullable(student).map(Student::getTeacher).map(Teacher::getName).orElse("<undefined>");

            System.out.println("uczen: " + studentName + " nauczyciel: " + teacherName);
        }
    }
}
