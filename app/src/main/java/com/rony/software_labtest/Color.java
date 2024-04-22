package com.rony.software_labtest;


public class Color {
    private String name;

    public Color(String name) {
        this.name = name;
    }

    public void showColor() {
        System.out.println("Color: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }
}
