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
        firstTime.time();
        Clock secondTime = context.getBean(Clock.class);
        secondTime.time();
        Clock thirdTime = context.getBean(Clock.class);
        thirdTime.time();
        Assertions.assertFalse(firstTime.returnTime().equals(secondTime.returnTime()));
        Assertions.assertFalse(secondTime.returnTime().equals(thirdTime.returnTime()));
        Assertions.assertFalse(firstTime.returnTime().equals(thirdTime.returnTime()));
    }

}