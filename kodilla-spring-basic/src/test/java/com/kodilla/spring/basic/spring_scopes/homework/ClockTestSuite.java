package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ClockTestSuite {

    @Test
    public void shouldCreateDifferentTime() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstTime = context.getBean(Clock.class);
        Clock secondTime = context.getBean(Clock.class);
        Clock thirdTime = context.getBean(Clock.class);
        System.out.println(firstTime.clock);
        System.out.println(secondTime.clock);
        System.out.println(thirdTime.clock);
        Assertions.assertNotEquals(firstTime, secondTime);
        Assertions.assertNotEquals(secondTime, thirdTime);
        Assertions.assertNotEquals(firstTime, thirdTime);
    }

}