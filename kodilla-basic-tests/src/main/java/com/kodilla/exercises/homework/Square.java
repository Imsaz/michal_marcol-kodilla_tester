package com.kodilla.exercises.homework;

public class Square extends Shape {
    public Square(int a) {
        super(a);
    }

    @Override
    public int surface(Shape shape) {
        return shape.getA() * shape.getA();
    }

    @Override
    public int circuit(Shape shape) {
        return 4*shape.getA();
    }
}
