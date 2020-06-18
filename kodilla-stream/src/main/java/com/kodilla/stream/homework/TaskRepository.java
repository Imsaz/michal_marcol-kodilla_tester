package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> listOfTask = new ArrayList<>();
        listOfTask.add(new Task("addToRepository", LocalDate.now(), LocalDate.of(2020, 7, 20)));
        listOfTask.add(new Task("readRuleBook", LocalDate.of(2019, 7, 20), LocalDate.of(2019, 8, 20)));
        listOfTask.add(new Task("writeReview", LocalDate.now(), LocalDate.of(2021, 8, 20)));
        listOfTask.add(new Task("addToRepository_1", LocalDate.now(), LocalDate.of(2022, 9, 20)));

        return listOfTask;
    }

}
