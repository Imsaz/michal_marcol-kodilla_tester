package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    private String name;
    private int horizontal;
    private int vertical;
    private boolean stamp;

    public Stamp(String name, int horizontal, int vertical, boolean stamp) {
        this.name = name;
        this.horizontal = horizontal;
        this.vertical = vertical;
        this.stamp = stamp;
    }

    public String getName() {
        return name;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public int getVertical() {
        return vertical;
    }

    public boolean isStamp() {
        return stamp;
    }

    @Override
    public String toString() {

        String stampVariable;

        if (this.stamp)
            stampVariable = "YES";

        else
            stampVariable = "NO";
        return "Stamp{" +
                "name='" + name + '\'' +
                ", horizontal= " + horizontal +
                ", vertical= " + vertical +
                ", stamp= " + stampVariable +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp1 = (Stamp) o;
        return horizontal == stamp1.horizontal &&
                vertical == stamp1.vertical &&
                stamp == stamp1.stamp &&
                Objects.equals(name, stamp1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, horizontal, vertical, stamp);
    }
}
