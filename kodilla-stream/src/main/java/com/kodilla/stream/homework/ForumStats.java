package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        var avgPostList = UsersRepository.getUsersLists()
                .stream()
                .filter(example -> example.getAge() >= 40)
                .map(User::getNumberOfPosts)
                .mapToInt(changeStream -> changeStream)
                .average()
                .getAsDouble();

        var avgPostListUnderForty = UsersRepository.getUsersLists()
                .stream()
                .filter(example -> example.getAge() < 40)
                .map(User::getNumberOfPosts)
                .mapToInt(changeStream -> changeStream)
                .average()
                .getAsDouble();

        System.out.println(avgPostList);
        System.out.println(avgPostListUnderForty);


    }

}
