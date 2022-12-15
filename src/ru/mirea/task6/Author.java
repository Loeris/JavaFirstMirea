package ru.mirea.task6;

import ru.mirea.task6.subtask1.INameable;
import ru.mirea.task6.subtask2.IPriceable;

public class Author implements INameable, IPriceable {
    private String name;
    private String email;
    private char gender;
    private int priceForMeet;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public Author(String name, String email, char gender, int priceForMeet) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.priceForMeet = priceForMeet;
    }

    @Override
    public int getPrice() {
        return priceForMeet;
    }
}
