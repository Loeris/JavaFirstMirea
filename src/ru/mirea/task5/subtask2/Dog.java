package ru.mirea.task5.subtask2;

public abstract class Dog {
    int mass;
    String color;
    Dog(int mass, String color){
        this.mass = mass;
        this.color = color;
    }
    abstract void Bark();
}
class Hound extends Dog{
    Hound(int mass, String color) {
        super(mass, color);
    }
    @Override
    void Bark() {
        System.out.println("Awooo");
    }
}
class Chihuahua extends Dog{
    Chihuahua(int mass, String color) {
        super(mass, color);
    }
    @Override
    void Bark() {
        System.out.println("Af!");
    }
}
class Wolf extends Dog{
    Wolf(int mass, String color) {
        super(mass, color);
    }
    @Override
    void Bark() {
        System.out.println("Grrrr");
    }
}