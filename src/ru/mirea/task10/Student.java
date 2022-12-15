package ru.mirea.task10;

import java.util.Comparator;

public class Student {
    String name;
    String surname;
    String speciality;
    int course;
    int group;
    Student(String name, String surname, String speciality, int course, int group){
        this.name =  name;
        this.surname = surname;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
    }
}
