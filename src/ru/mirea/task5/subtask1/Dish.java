package ru.mirea.task5.subtask1;

public abstract class Dish {
    protected int mass;
    protected String color;

    Dish(int mass, String color){
        this.mass = mass;
        this.color = color;
    }
    int getMass() {
        return mass;
    }
    String getColor() {
        return color;
    }
    abstract String getShape();
}

class Plate extends Dish{
    Plate(int mass, String color) {
        super(mass, color);
    }
    @Override
    public String getShape() {
        return "Circle";
    }
}
class Glass extends Dish{
    Glass(int mass, String color) {
        super(mass, color);
    }
    @Override
    public String getShape() {
        return "Cylinder";
    }
}
class Knife extends Dish{
    Knife(int mass, String color) {
        super(mass, color);
    }
    @Override
    public String getShape() {
        return "Rectangle";
    }
}

