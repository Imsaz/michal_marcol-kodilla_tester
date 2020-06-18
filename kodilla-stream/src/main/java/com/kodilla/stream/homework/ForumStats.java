package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

//TODO

public class ForumStats {
    public static void main(String[] args) {
        var postList = UsersRepository.getUsersLists()
                .stream()
                .map(u -> u.getAge())
                //.mapToInt(n -> n)
                .filter(a -> a >= 40)

                .collect(toList());
        //.average()
        //.getAsDouble();
        System.out.println(postList);

        //UsersRepository.getUsersLists().
    }
}
