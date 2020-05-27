package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {

    private int speed;

    public Opel () {
        speed = 0;
    }

    public Opel(int speed){
        this.speed = speed;
    }

    public String getName() {
        return "Opel";
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 30;
    }

    @Override
    public void decreaseSpeed() {
        if (speed > 25){
            speed -= 25;
        }
        else speed = 0;
    }
}
