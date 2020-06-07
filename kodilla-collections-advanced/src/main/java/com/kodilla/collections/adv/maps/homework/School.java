package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String nameOfSchool;
    private List<Integer> numberOfStudents = new ArrayList<>();

    public School(String nameOfSchool, int... numberOfStudents) {
        this.nameOfSchool = nameOfSchool;
        for(int students : numberOfStudents)
            this.numberOfStudents.add(students);
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    @Override
    public String toString() {
        return "Number of students: " + numberOfStudents.toString();
    }

    public int numberOfAllStudents() {
        int sum = 0;
        for (int students : numberOfStudents) {
            sum += students;
        }
        return sum;
    }
}
