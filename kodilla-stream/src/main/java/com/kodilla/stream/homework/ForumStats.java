package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ForumStats {
    public static void main(String[] args) {
        var avgNumberOfPostsBy40Plus = UsersRepository.getUsersLists()
                .stream()
                .map(User::getAge)
                .filter(age -> age >= 40)
                .map(ForumStats::getUserByAge)
                .map(User::getNumberOfPosts)
                .mapToInt(postsNumber -> postsNumber)
                .average()
                .getAsDouble();

        var avgNumberOfPostsByBelow40 = UsersRepository.getUsersLists()
                .stream()
                .map(User::getAge)
                .filter(age -> age < 40)
                .map(ForumStats::getUserByAge)
                .map(User::getNumberOfPosts)
                .mapToInt(postsNumber -> postsNumber)
                .average()
                .getAsDouble();

        System.out.println(avgNumberOfPostsBy40Plus);
        System.out.println(avgNumberOfPostsByBelow40);
    }

    private static User getUserByAge(int age) {
        return UsersRepository.getUsersLists()
                .stream().filter(u -> u.getAge() == age)
                .findFirst()
                .get();
    }
}
