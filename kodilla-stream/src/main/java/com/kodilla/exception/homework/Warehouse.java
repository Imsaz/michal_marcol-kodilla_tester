package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {
    private static List<Order> listOfOrder = new ArrayList<>();

    public void addOrder(Order order) {
        listOfOrder.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        var orders = listOfOrder
                .stream()
                .filter(num -> num.getNumber().equals(number))
                .collect(Collectors.toList());

        if (orders.isEmpty())
            throw new OrderDoesntExistException();
        else
            return getOrderbyNumber(number);
    }

    private static Order getOrderbyNumber (String number){
        for (var example: listOfOrder){
            if (example.getNumber().equals(number))
                return example;

        }
        return null;
    }

}
