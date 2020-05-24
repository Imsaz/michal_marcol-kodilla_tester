package com.kodilla.exercises.inheritance.homework;

public class RedHat extends OperatingSystem{


    public RedHat (int yearOfPublication){
        super(yearOfPublication);
    }

    @Override
    public void turnOn(){
        System.out.println("System RedHat turns on");
    }

    @Override
    public void turnOff(){
        System.out.println("System RedHat turns off");
    }
}
