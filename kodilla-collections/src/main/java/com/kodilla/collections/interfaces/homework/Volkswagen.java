package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Volkswagen implements Car {

    private int speed;

    public Volkswagen () {
        speed = 0;
    }

    public String getName() {
        return "Volkswagen";
    }

    public Volkswagen(int speed) {
        this.speed = speed;
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

    @Override
    public String toString() {
        return "Volkswagen{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volkswagen that = (Volkswagen) o;
        return speed == that.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
