package ru.mirea.task3.subtask1;

public class Circle {
    public static final double PI = 3.14;
    private double radius;
    private double length;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        length = 2 * PI * radius;
        area = PI * Math.pow(radius,2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return getRadius() + " " +getLength() + " " + getArea();
    }
}
