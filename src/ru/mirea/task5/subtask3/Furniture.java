package ru.mirea.task5.subtask3;

public abstract class Furniture {
    int mass;
    String color;
    Furniture(int mass, String color){
        this.mass = mass;
        this.color = color;
    }
    abstract String getType();
}
class Table extends Furniture{
    Table(int mass, String color) {
        super(mass, color);
    }
    @Override
    String getType() {
        return "Table";
    }
}
class Chair extends Furniture{
    Chair(int mass, String color) {
        super(mass, color);
    }
    @Override
    String getType() {
        return "Chair";
    }
}
