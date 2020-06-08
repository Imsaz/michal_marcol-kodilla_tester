package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapeListApplication {
    public static void main(String[] args) {
        List<Square> shapes = new ArrayList<>();

        shapes.add(new Square(10.0));
        shapes.add(new Square(5.0));
        shapes.add(new Square(1.0));

        for (Square square: shapes) {
            if (square.getArea() > 20)
                System.out.println(square + ", area: " + square.getArea());
        }
        /*
        for (int n = 0; n < shapes.size(); n++){
            Square square = shapes.get(n);

            if (square.getArea() > 20)
                System.out.println(shapes.get(n) + ", area: " + square.getArea());
        }
        /*Square sq1 = new Square(10.0);
        Square sq2 = new Square(5.0);
        Square sq3 = new Square(1.0);

        shapes.add(sq1);
        shapes.add(sq2);
        shapes.add(sq3);*/
    }
}
