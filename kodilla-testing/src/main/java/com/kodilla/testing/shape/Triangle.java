package com.kodilla.testing.shape;

public class Triangle implements Shape {
    int a, h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public double getField() {
        return 0.5 * a * h;
    }
}
