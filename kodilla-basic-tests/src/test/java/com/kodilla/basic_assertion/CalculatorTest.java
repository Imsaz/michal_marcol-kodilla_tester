package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorTest {

    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a,b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract(){
        assertEquals(-1,new Calculator().subtract(1,2));
    }

    @Test
    public void testPowerPositive(){
        assertEquals(25,new Calculator().power2(5));
    }

    @Test
    public void testPowerNegative(){
        assertEquals(25,new Calculator().power2(-5));
        assertNotEquals(-25,new Calculator().power2(-5));
    }

    @Test
    public void testPower0(){
        assertEquals(0,new Calculator().power2(0));
    }
}
