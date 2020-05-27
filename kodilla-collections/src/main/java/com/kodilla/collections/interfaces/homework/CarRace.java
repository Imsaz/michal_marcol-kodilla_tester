package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        Car ford = new Ford();
        Car vw = new Volkswagen();
        Car opel = new Opel();

        doRace(ford);
        doRace(vw);
        doRace(opel);

        System.out.println("Speed ford: " + ford.getSpeed() + "\nSpeed vw: " + vw.getSpeed() + "\nSpeed opel: " + opel.getSpeed() );
    }

    private static void doRace (Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        car.decreaseSpeed();
        car.decreaseSpeed();
    }
}
