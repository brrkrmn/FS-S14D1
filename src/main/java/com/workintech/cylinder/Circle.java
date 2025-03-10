package com.workintech.cylinder;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = Math.max(0, radius);
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public void setRadius(int radius) {
        this.radius = Math.max(0, radius);;
    }

    public int getRadius() {
        return radius;
    }
}
