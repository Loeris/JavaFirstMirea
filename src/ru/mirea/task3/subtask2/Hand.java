package ru.mirea.task3.subtask2;

public class Hand {
    private byte countOfFingers;
    public void take() {
        System.out.println("Hand is taking.");
    }
    public Hand(byte countOfFingers) {
        this.countOfFingers = countOfFingers;
    }
}
