package ru.mirea.task7.subtask2;

public class Program {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(0, 0, 2, 3);
        System.out.println(circle);
        circle.moveDown();
        circle.moveDown();
        circle.moveLeft();
        circle.moveLeft();
        System.out.println(circle);

        MovablePoint point1 = new MovablePoint(0, 0, 10, 10);
        MovablePoint point2 = new MovablePoint(5, 5, 5, 5);

        System.out.println(point1);
        System.out.println(point2);

        point1.moveUp();
        point2.moveLeft();
        point2.moveDown();

        System.out.println(point1);
        System.out.println(point2);

        MovableRectangle rectangle = new MovableRectangle(point1.x, point1.y,
                                                          point2.x, point2.y,
                                                          point1.xSpeed,
                                                          point2.ySpeed);

        System.out.println(rectangle);

        rectangle.moveDown();
        rectangle.moveDown();

        System.out.println(rectangle);
    }
}
