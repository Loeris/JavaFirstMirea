package ru.mirea.task2;

public class Main {
    public static void main(String[] args) {
//        Ball ball= new Ball("футбольный");
//        System.out.println(ball);
//        ball.kick();
//        System.out.println(ball.getType());
//
//        Book book = new Book("научная");
//        book.close();
//        book.open();
//        book.open();
//        book.close();
//        System.out.println(book.getType());

        TestDog testDog = new TestDog();
        testDog.add(5);
        System.out.println(testDog);
        testDog.add(3);
        System.out.println(testDog);
    }
}
