package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class CarFactory {

    @Bean
    public Car typeOfCar (){
        Car car;
        LocalDate date = LocalDate.now();
        if (date.getMonthValue() == 12 || date.getMonthValue() < 3) {
            car = new SUV();
        } else if (date.getMonthValue() > 5 && date.getMonthValue() < 9) {
            car = new Cabrio();
        } else {
            car = new Sedan();
        }


        return car;
    }
}
