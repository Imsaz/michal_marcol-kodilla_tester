package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class CarFactoryTestSuite {

    @Test
    public void testCarCreated() {
        //Given
        ApplicationContext context1 = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car cabrio = context1.getBean(Cabrio.class);
        //When
        String voice = cabrio.getCarType();
        //Then
        Assertions.assertEquals("Cabrio", voice);
    }

    @Test
    public void shouldCreateCarBySeason() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("typeOfCar");
        //When
        String carType = car.getCarType();
        System.out.println(carType);
        //Then
        List<String> possibleCars = Arrays.asList("SUV", "Sedan", "Cabrio");
        Assertions.assertTrue(possibleCars.contains(carType));
        Assertions.assertFalse(car.hasHeadlightsTurnedOn());
    }
}