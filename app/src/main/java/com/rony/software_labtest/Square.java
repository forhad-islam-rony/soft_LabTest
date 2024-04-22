package com.rony.software_labtest;

public class Square extends Shape {
    private float sideLength;

    public Square(String name, float sideLength) {
        super(name);
        this.sideLength = sideLength;
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }

    @Override
    public double perimeter() {
        return 4 * sideLength;
    }
}