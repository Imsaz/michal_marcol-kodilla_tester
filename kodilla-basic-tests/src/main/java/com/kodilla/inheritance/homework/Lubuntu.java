package com.kodilla.inheritance.homework;

public class Lubuntu extends OperatingSystem{

    public Lubuntu (int yearOfPublication){
        super(yearOfPublication);
    }

    @Override
    public void turnOn(){
        System.out.println("System Lubuntu turns on");
    }

    @Override
    public void turnOff(){
        System.out.println("System Lubuntu turns off");
    }
}
