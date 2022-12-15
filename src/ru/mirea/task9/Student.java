package ru.mirea.task9;

public class Student implements IComparable<Student> {
    String name;
    int id;
    Student(int id, String name){
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }

    @Override
    public int compareTo(Student o) {
        return (id < o.id)?1:0;
    }
}
