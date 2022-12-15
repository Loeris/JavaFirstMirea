package ru.mirea.task2;

public class Book {
    private String typeOfBook;
    private boolean isOpen = false;
    public Book() {
        typeOfBook = "";
    }

    public Book (String typeOfBook){
        this.typeOfBook = typeOfBook + " ";
    }

    public void open(){
        if (isOpen) System.out.printf("%sКнига уже открыта\n", typeOfBook);
        else {
            System.out.printf("%sКнига открыта\n", typeOfBook);
            isOpen = true;
        }
    }

    public void close() {
        if (isOpen) {
            System.out.printf("%sКнига закрыта\n", typeOfBook);
            isOpen = false;
        }
        else System.out.printf("%sКнига уже закрыта\n", typeOfBook);
    }

    public String getType() {
        return typeOfBook;
    }

    @Override
    public String toString() {
        return "Я " + typeOfBook + "книга\n";
    }
}
