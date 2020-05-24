package com.kodilla.exercises.homework;

public class Diamond extends Shape{

    public Diamond(int a, int h) {
        super(a, h);
    }

    @Override
    public int surface(Shape shape) {
        return shape.getA() * shape.getB();
    }

    @Override
    public int circuit(Shape shape) {
        return 4*shape.getA();
    }
}
