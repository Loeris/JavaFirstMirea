package ru.mirea.task10;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.group < o2.group) return -1;
        if (o1.group == o2.group) return 0;
        if (o1.group > o2.group) return 1;
        return 0;
    }
}
