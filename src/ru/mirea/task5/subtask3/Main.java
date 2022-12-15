package ru.mirea.task5.subtask3;

public class Main {
    public static void main(String[] args){
        FurnitureShop shop = new FurnitureShop();
        shop.Add(new Table(100, "Brown"));
        shop.Add(new Chair(50, "Green"));
        shop.Add(new Table(120, "White"));
        shop.Add(new Chair(60, "Black"));
        shop.Add(new Chair(40, "Blue"));
        shop.Add(new Chair(70, "White"));

        shop.Info();
    }
}
