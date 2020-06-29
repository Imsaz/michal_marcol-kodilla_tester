package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {

    private double costOfOrder;
    private LocalDate date;
    private String login;

    public Order(double costOfOrder, LocalDate date, String login) {
        this.costOfOrder = costOfOrder;
        this.date = date;
        this.login = login;
    }

    public double getCostOfOrder() {
        return costOfOrder;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }
}
