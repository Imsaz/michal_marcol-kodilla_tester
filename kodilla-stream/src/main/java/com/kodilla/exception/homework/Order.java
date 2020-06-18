package com.kodilla.exception.homework;

public class Order {
    String number;

    @Override
    public String toString() {
        return "Order{" +
                "number='" + number + '\'' +
                '}';
    }

    public Order(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}
