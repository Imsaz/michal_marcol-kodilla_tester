package com.kodilla.exercises.inheritance.homework;

public class OperatingSystem {

    private int yearOfPublication;

    public OperatingSystem(int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }

    public void turnOn() {
        System.out.println("System turns on");
    }

    public void turnOff() {
        System.out.println("System turns off");
    }
}
