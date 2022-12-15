package ru.mirea.task4.subtask2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(0, 0);
        System.out.println(ball.getX() + " " + ball.getY());

        ball.setX(1);
        ball.setY(ball.getX());

        System.out.println(ball);

        ball.setXY(50, 100);
        System.out.println(ball);

        ball.move(-50, -200);
        System.out.println(ball);
    }
}
