package ru.mirea.task10;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        Comparator<Student> cmp = new StudentComparator();
        TreeSet<Student> arr1 = new TreeSet(cmp);
        arr1.add(new Student("Ivan", "Piatro", "IIT", 2, 2));
        arr1.add(new Student("Ivan", "Piatro", "IIT", 2, 4));
        arr1.add(new Student("Ivan", "Piatro", "IIT", 2, 3));
        TreeSet<Student> arr2 = new TreeSet(cmp);
        arr2.add(new Student("Ivan", "Piatro", "IIT", 2, 1));
        arr2.add(new Student("Ivan", "Piatro", "IIT", 2, 5));
        System.out.println("Arr1");
        for (Student e: arr1)
            System.out.println(e.group);
        System.out.println();
        System.out.println("Arr2");
        for (Student e: arr2)
            System.out.println(e.group);
        System.out.println();
        System.out.println("ArrTotal");
        TreeSet<Student> arr = new TreeSet(cmp);
        arr.addAll(arr1);
        arr.addAll(arr2);
        for (Student e: arr)
            System.out.println(e.group);
    }
}
