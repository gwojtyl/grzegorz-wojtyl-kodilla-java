package com.kodilla.testing.shape;

public class Square implements Shape {
    int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public double getField() {
        return a * a;
    }
}
