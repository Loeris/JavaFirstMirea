package ru.mirea.task5.subtask3;

import java.util.Vector;

public class FurnitureShop {
    Vector<Furniture> arr = new Vector<Furniture>();
    int tables;
    int chairs;
    int total;
    void Add(Furniture e){
        arr.add(e);
        total++;
        if (e.getType().equals("Table"))
            tables++;
        if (e.getType().equals("Chair"))
            chairs++;
    }
    void Info(){
        System.out.println(total);
        System.out.println(tables);
        System.out.println(chairs);
        for (Furniture e: arr)
            System.out.println(e.mass + " " + e.color + " " + e.getType());
    }
}
