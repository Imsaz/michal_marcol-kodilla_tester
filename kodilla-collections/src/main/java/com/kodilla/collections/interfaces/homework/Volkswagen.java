package com.kodilla.collections.interfaces.homework;

public class Volkswagen implements Car {

    private int speed;

    public Volkswagen() {
        speed = 0;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 40;
    }

    @Override
    public void decreaseSpeed() {
        if (speed > 30){
            speed -= 30;
        }
        else speed = 0;
    }
}
