package com.rony.software_labtest;

public class Circle extends Shape {
    private float radius;

    public Circle(String name, float radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.1416 * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * 3.1416 * radius;
    }
}
