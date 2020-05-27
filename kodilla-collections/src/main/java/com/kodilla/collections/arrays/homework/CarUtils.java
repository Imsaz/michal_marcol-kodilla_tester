package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("---------------------------");
        System.out.println("Car name: " + car.getName());
        System.out.println("Car speed: " + car.getSpeed());
    }
}
