package ru.mirea.task3.subtask3;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book);
        book.setAuthor("Н.В. Гоголь");
        book.setName("Нос");
        book.setPages(150);
        book.setYearOfWriting(1832);
        System.out.println(book);
    }
}
