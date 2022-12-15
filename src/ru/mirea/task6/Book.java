package ru.mirea.task6;

import ru.mirea.task6.subtask1.INameable;
import ru.mirea.task6.subtask2.IPriceable;

public class Book implements INameable, IPriceable {
    private String name;
    private int price;

    public Book(String name) {
        this.name = name;
    }

    public Book(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
