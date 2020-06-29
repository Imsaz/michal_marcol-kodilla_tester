package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();
    Order chocolate = new Order(12.3, LocalDate.of(2020,6,30), "Alex");
    Order cucumber = new Order(7, LocalDate.of(2020,5,30), "Max");
    Order banana = new Order(5, LocalDate.of(2020,4,30), "Alex");

    @Test
    public void shouldAddItemToShop() {
       assertEquals(3, shop.numberOfOrders());
    }

    @Test
    public void shouldReturnListOfOrderByDates(){
        List<Order> orders = shop.getOrders(LocalDate.of(2020,5,20), LocalDate.of(2020,6,5));
        assertEquals(1,orders.size());
        assertEquals("Max", orders.get(0).getLogin());
    }

    @Test
    public void shouldReturnEmptyListIfDatesToIsBeforeDateFrom(){
        List<Order> orders = shop.getOrders(LocalDate.of(2020,5,20), LocalDate.of(2020,4,5));
        assertEquals(0,orders.size());

    }

    @Test
    public void shouldReturnListOfOrderByPrice(){
        List<Order> orders = shop.getOrders(5.0, 8.0);
        assertEquals(1,orders.size());
        assertEquals("Max", orders.get(0).getLogin());
    }

    @Test
    public void shouldReturnEmptyListIfPriceToIsLowerThanPriceFrom(){
        List<Order> orders = shop.getOrders(5.0, 4.0);
        assertEquals(0,orders.size());
    }

    @Test
    public void shouldReturnNumberOfOrders(){
        assertEquals(3, shop.numberOfOrders());
    }

    @Test
    public void shouldReturnSumOfOrders(){
        assertEquals(24.3, shop.sumOfAllOrders());
    }

    @BeforeEach
    public void initializeOrders() {
        shop.addOrder(chocolate);
        shop.addOrder(cucumber);
        shop.addOrder(banana);
    }
    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}