package ru.mirea.task5.subtask2;

import java.util.Vector;

public class Main {
    public static void main(String[] args){
        Dog hound = new Hound(100,"black");
        Dog chihuahua = new Chihuahua(10,"yellow");
        Dog wolf = new Wolf(200,"gray");
        Vector<Dog> arr = new Vector<Dog>();
        arr.add(hound);
        arr.add(chihuahua);
        arr.add(wolf);
        for (Dog e: arr){
            System.out.println(e.color);
            System.out.println(e.mass);
            e.Bark();
            System.out.println();
        }
    }
}
