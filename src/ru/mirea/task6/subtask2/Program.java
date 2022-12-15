package ru.mirea.task6.subtask2;

import ru.mirea.task6.Author;
import ru.mirea.task6.Book;

public class Program {
    public static void main(String[] args) {
        Author author = new Author("Petrov", "net@mail.ru", 'M', 200);
        Book book = new Book(500);
        IPriceable priceable;
        priceable = author;
        System.out.println(priceable.getPrice());

        priceable = book;
        System.out.println(priceable.getPrice());
    }
}
