package ru.mirea.task5;

public abstract class Dish {
    private int mass;
    private int transparency;
    private String name;

    public abstract int getMass();

    public abstract void setMass(int mass);

    public abstract int getTransparency();

    public abstract void setTransparency(int transparency);

    public abstract String getName();

    public abstract void setName(String name);
}
