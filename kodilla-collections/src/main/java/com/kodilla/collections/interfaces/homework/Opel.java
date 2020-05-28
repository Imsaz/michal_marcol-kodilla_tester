package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Opel{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return speed == opel.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
