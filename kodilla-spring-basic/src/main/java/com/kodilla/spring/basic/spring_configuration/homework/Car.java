package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public interface Car {
    default Boolean hasHeadlightsTurnedOn(){
        LocalTime time = LocalTime.now();

        return time.isAfter(LocalTime.of(20, 0)) || time.isBefore(LocalTime.of(6, 0));
    };

    String getCarType();
}
