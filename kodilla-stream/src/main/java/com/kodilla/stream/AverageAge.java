package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args) {
        double avg =  UsersRepository.getUsersLists()
                .stream()
                .map(u -> u.getAge())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avg);
    }
}
