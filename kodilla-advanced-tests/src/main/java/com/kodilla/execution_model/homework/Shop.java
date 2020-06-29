package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private List<Order> listOfOrders = new ArrayList<>();

    public void addOrder(Order order) {
        this.listOfOrders.add(order);
    }

    public List<Order> getOrders(LocalDate from, LocalDate to) {
        List<Order> list = listOfOrders
                .stream()
                .filter(date -> date.getDate().isAfter(from) && date.getDate().isBefore(to))
                .collect(Collectors.toList());
        return list;
    }

    public List<Order> getOrders(double priceFrom, double priceTo) {
        List<Order> list = listOfOrders
                .stream()
                .filter(order -> order.getCostOfOrder() > priceFrom && order.getCostOfOrder() < priceTo)
                .collect(Collectors.toList());
        return list;
    }

    public int numberOfOrders() {
        return listOfOrders.size();
    }

    public double sumOfAllOrders() {
        double sum = 0;
        for (Order order : listOfOrders) {
            sum += order.getCostOfOrder();
        }

        return sum;
    }
}
