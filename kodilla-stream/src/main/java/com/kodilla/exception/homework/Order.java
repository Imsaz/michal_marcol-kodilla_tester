package com.kodilla.exception.homework;

import java.util.Objects;

public class Order {
    String number;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Objects.equals(number, order.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

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
