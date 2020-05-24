package com.kodilla.exercises.homework;

public abstract class Shape {

    private int a;
    private int b;
    private int h;

    public Shape (int a, int b)
    {
        this.a = a;
        this.b = b;

    }

    public Shape (int a)
    {
        this.a = a;
    }

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }

    public abstract int surface(Shape shape);

    public abstract int circuit(Shape shape);

}
