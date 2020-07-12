package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {
    @Autowired
    ShippingCenter shippingCenter;

    @Test
    public void shouldReturnSuccessMessage() {
        String a = "Package delivered to: Krakow";
        assertTrue(a.equals(shippingCenter.sendPackage("Krakow",25)));
    }

    @Test
    public void shouldReturnFalseMessage() {
        String a = "Package not delivered to: Krakow";
        assertTrue(a.equals(shippingCenter.sendPackage("Krakow",75)));
    }

}