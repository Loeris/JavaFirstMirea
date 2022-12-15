package ru.mirea.task3.subtask2;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human(new Head(123456789), new Leg(43.5), new Hand((byte)5));
        human.head.think();
        human.hand.take();
        human.leg.step();
    }
}
