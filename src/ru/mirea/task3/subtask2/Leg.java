package ru.mirea.task3.subtask2;

public class Leg {
    private double footLength;
    public void step() {
        System.out.println("Leg is stepping.");
    }

    public Leg(double footLength) {
        this.footLength = footLength;
    }
}
