package ru.mirea.task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Student[] iDNumber = new Student[5];
        iDNumber[0] = new Student(4,"Ivan");
        iDNumber[1] = new Student(1,"Alex");
        iDNumber[2] = new Student(2,"Dmitriy");
        iDNumber[3] = new Student(3,"Elizaveta");
        iDNumber[4] = new Student(5,"Sonya");
        for (Student e: iDNumber)
            System.out.println(e);
        selectionSort(iDNumber);
        System.out.println();
        for (Student e: iDNumber)
            System.out.println(e);
    }
    public static void selectionSort(IComparable[] array) {
        for (int i = 0; i < array.length; i++) {
            IComparable min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j].compareTo(min) == 1) {
                    min = array[j];
                    minId = j;
                }
            }
            // замена
            IComparable temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }
}
