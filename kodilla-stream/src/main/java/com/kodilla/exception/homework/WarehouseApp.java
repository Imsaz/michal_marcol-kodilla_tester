package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Order order1 = new Order("111");
        Order order2 = new Order("222");
        Order order3 = new Order("333");

        warehouse.addOrder(order1);
        warehouse.addOrder(order2);
        warehouse.addOrder(order3);

        try {
            warehouse.getOrder("33").forEach(o -> System.out.println(o));
        } catch (OrderDoesntExistException e) {
            e.printStackTrace();
        }
    }
}
