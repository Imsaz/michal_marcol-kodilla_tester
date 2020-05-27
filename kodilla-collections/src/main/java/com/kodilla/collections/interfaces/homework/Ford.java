package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private int speed;

    public Ford () {
        speed = 0;
    }

    public Ford(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return "Ford";
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 35;
    }

    @Override
    public void decreaseSpeed() {
        if (speed > 23){
            speed -= 23;
        }
        else speed = 0;
    }
}
