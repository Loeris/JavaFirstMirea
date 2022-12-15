package ru.mirea.task3.subtask3;

public class Book {
    private String author = "NO NAME";
    private String name = "NO TITLE";
    private int yearOfWriting = 0;
    private int pages = 0;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfWriting() {
        return yearOfWriting;
    }

    public void setYearOfWriting(int yearOfWriting) {
        this.yearOfWriting = yearOfWriting;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Автор: " + author +
                ", Название: " + name +
                ", Год написания: " + yearOfWriting +
                ", Количество страниц: " + pages;
    }
}
