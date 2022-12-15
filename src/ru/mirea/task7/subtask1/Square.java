package ru.mirea.task7.subtask1;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.length;
    }

    public void setSide(double side) {
        super.length = super.width = side;
    }

    public void setWidth(double side) {
        setSide(side);
    }

    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", size=" + getSide() +
                '}';
    }
}
