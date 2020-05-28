package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volkswagen;
import com.kodilla.collections.arrays.homework.CarUtils;

import java.util.ArrayList;
import java.util.List;

public class CarsListsApplication {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Ford ford = new Ford(20);

        cars.add(ford);
        cars.add(new Opel(30));
        cars.add(new Volkswagen(40));

        for (Car car: cars) CarUtils.describeCar(car);

        cars.remove(1);
        cars.remove(ford);

        System.out.println("---------------------------");
        System.out.println("size of collections: " + cars.size());
        System.out.println("---------------------------");

        for (Car car: cars) {
            CarUtils.describeCar(car);
        }

        Volkswagen vw = new Volkswagen(40);

        cars.remove(vw);

        System.out.println("---------------------------");
        System.out.println("size of collections: " + cars.size());
        System.out.println("---------------------------");
    }
}
