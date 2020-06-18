package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private static List<Order> listOfOrder = new ArrayList<>();

    public void addOrder(Order order) {
        listOfOrder.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        var orders = listOfOrder.stream()
                .map(Order::getNumber)
                .filter(num -> num.equals(number))
                .findAny();
        if (orders.isEmpty())
            throw new OrderDoesntExistException();
        else
            return getOrderbyNumber(orders.get());
    }

    private static Order getOrderbyNumber (String number){
        for (var example: listOfOrder){
            if (example.getNumber().equals(number))
                return example;

        }
        return null;
    }

}
