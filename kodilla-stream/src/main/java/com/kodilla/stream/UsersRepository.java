package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

//TODO

public class UsersRepository {
    public static List<User> getUsersLists() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Ruco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Fring", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 50, 0, "Security"));

        return users;
    }
}
