package ru.mirea.task10;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        Comparator<Student> cmp = new StudentComparator();
        TreeSet<Student> arr1 = new TreeSet(cmp);
        TreeSet<Student> arr2 = new TreeSet(cmp);
    }
}
