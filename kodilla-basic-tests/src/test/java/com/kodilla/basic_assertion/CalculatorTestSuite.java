package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a,b);
        assertEquals(14, sumResult);
    }
}
