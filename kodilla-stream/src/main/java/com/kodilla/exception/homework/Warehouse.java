package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {
    private static List<Order> listOfOrder = new ArrayList<>();

    public void addOrder(Order order) {
        listOfOrder.add(order);
    }

    public List<String> getOrder(String number) throws OrderDoesntExistException {
        var orders = listOfOrder.stream()
                .map(a -> a.getNumber())
                .filter(num -> num.equals(number))
                .collect(Collectors.toList());
        if (orders.isEmpty())
            throw new OrderDoesntExistException();
        else
            return orders;
    }
}
