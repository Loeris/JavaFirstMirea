package ru.mirea.task6.subtask1;

import ru.mirea.task6.Author;
import ru.mirea.task6.Book;

public class Program {
    public static void main(String[] args) {
        Author author = new Author("Petrov", "123@mail.ru", 'M');
        Book book = new Book("For Whom The Bell Toss");
        INameable nameable;

        nameable = author;
        System.out.println(nameable.getName());

        nameable = book;
        System.out.println(nameable.getName());
    }
}
