package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    public Rectangle(int a, int b) {
        super(a, b);
    }

    @Override
    public int surface(Shape shape) {
        return shape.getA() * shape.getB();
    }

    @Override
    public int circuit(Shape shape) {
        return 2*shape.getA() + 2*shape.getB();
    }
}
