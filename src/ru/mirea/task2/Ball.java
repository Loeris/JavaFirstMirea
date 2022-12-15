package ru.mirea.task2;

public class Ball {
    private String typeOfBall;
    public Ball() {
        this.typeOfBall = " ";
    }
    public Ball(String typeOfBall) {
        this.typeOfBall = " " + typeOfBall + " ";
    }

    @Override
    public String toString() {
        return "Я" + typeOfBall + "мяч. Экземпляр класса Ball\n";
    }

    public String getType() {
        return typeOfBall;
    }
    public void kick() {
        System.out.println("Вы пнули мяч.");
    }
}
