package ru.mirea.task5.subtask1;
import java.util.Vector;

public class Main {
    public static void main(String[] args){
        Dish plate = new Plate(100,"white");
        Dish glass = new Glass(60,"transparent");
        Dish knife = new Knife(40,"black");
        Vector<Dish> arr = new Vector<Dish>();
        arr.add(plate);
        arr.add(glass);
        arr.add(knife);
        for (Dish e: arr){
            System.out.println(e.getColor());
            System.out.println(e.getMass());
            System.out.println(e.getShape());
            System.out.println();
        }
    }
}
