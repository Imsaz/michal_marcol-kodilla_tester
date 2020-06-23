package com.kodilla.exception.homework;

import com.kodilla.exception.AirportNotFoundException;
import org.junit.Test;

import static org.junit.Assert.*;

//TODO

public class WarehouseTestSuite {

    @Test
    public void testGetOrderWithoutExemption() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();

        Order order1 = new Order("111");
        Order order2 = new Order("222");
        Order order3 = new Order("333");

        warehouse.addOrder(order1);
        warehouse.addOrder(order2);
        warehouse.addOrder(order3);
        // when
        boolean orderExist = new Order("222").equals(warehouse.getOrder("222"));
        // then
        assertTrue(orderExist);
    }

    @Test (expected = OrderDoesntExistException.class)
    public void testGetOrder_WithExemption() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("111"));
        warehouse.addOrder(new Order("222"));
        warehouse.addOrder(new Order("333"));
        // when
        boolean orderDoesntExist = new Order("222").equals(warehouse.getOrder("22"));
        // then
        assertTrue(orderDoesntExist);
    }
}