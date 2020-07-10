package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    Calculator calculator;

    @Test
    public void shouldReturnSumOfAdd() {
       double result = calculator.add(5, 7.5);
       assertEquals(12.5, result);
    }

    @Test
    public void shouldReturnSumOfSubtract() {
        double result = calculator.subtract(5, 7.5);
        assertEquals(-2.5, result);
    }

    @Test
    public void shouldReturnSumOfMultiply() {
        double result = calculator.multiply(5, 7.5);
        assertEquals(37.5, result);
    }

    @Test
    public void shouldReturnSumOfDivide() {
        double result = calculator.divide(15, 7.5);
        assertEquals(2, result);
    }
}