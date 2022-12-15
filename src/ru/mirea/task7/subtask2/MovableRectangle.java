package ru.mirea.task7.subtask2;

public class MovableRectangle implements IMovable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int upX, int upY, int downX, int downY, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(upX, upY, xSpeed, ySpeed);
        bottomRight = new MovablePoint(downX, downY, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "up=" + topLeft +
                ", down=" + bottomRight +
                '}';
    }
}
