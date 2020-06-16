package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> usernames = UsersRepository.getUsersLists()
                .stream()
                .filter(u -> u.getGroup().equals("Chemists")) //this line returns a stream of users, that belong to particular group
                .map( ::getUserName)/*TODO: Here do the following mapping: for each user -> call static method getUserName from this class*/
                .collect(Collectors.toList());
        System.out.println(usernames);
    }

    public static String getUserName(User user){
        return user.getUsername();
    }
}
