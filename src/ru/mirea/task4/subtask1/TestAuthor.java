package ru.mirea.task4.subtask1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Петров Пётр Петрович", "petr@ya.ru", 'М');
        System.out.println(author.getEmail() + " " + author.getName() + " " + author.getGender());
        author.setEmail("petr@yandex.ru");
        System.out.println(author);
    }
}
