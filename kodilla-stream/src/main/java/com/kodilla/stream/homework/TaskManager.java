package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        /*TODO: Review - deadlines should be a list of LocalDate*/
        List<Task> deadlines = TaskRepository.getTasks()
                .stream()
                .filter(u -> u.getDeadline().isAfter(LocalDate.now()))/*TODO: Review - suggestion to change variable u to different word, associated with task*/
                /*TODO: Review - do a mapping here
                 for for every task from filter -> get task deadline
                   */
                .collect(Collectors.toList());
        System.out.println(deadlines);
    }
}
