package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Shape square = new Square(4);
        System.out.println("Surface equals: " + square.surface(square) + "\nCircuit equals: " + square.circuit(square));

        Rectangle rectangle = new Rectangle(5, 7);
        System.out.println("\nSurface equals: " + rectangle.surface(rectangle) + "\nCircuit equals: " + rectangle.circuit(rectangle));

        Diamond diamond = new Diamond(7, 9);
        System.out.println("\nSurface equals: " + diamond.surface(diamond) + "\nCircuit equals: " + diamond.circuit(diamond));

    }
}
