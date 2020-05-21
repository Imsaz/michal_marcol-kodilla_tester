package com.kodilla.inheritance.homework;

public class StartOfOperatingSystem {

    public static void main (String[] args)
    {
        OperatingSystem operatingSystem = new OperatingSystem(2002);

        Lubuntu lubuntu = new Lubuntu(2005);
        RedHat redhat = new RedHat(2010);

        operatingSystem.turnOff();
        lubuntu.turnOff();
        redhat.turnOff();

        operatingSystem.turnOn();
        lubuntu.turnOn();
        redhat.turnOn();
    }
}
