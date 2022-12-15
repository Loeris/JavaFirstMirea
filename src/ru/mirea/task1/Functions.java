package ru.mirea.task1;

import java.util.*;

public class Functions {
    public static void printArray(int[] array){
        for (int x: array) {
            System.out.println(x);
        }
    }
    // 3 подзадача
    public static void arraySum() {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите кол-во элементов: ");
            n = scanner.nextInt();
        } while (n < 0);

        int[] arr = new int[n];

        int i;
        for (i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        while (i-- != 0) {
            sum += arr[i];
        }

        System.out.print(sum);
    }
    // 4 подзадача
    public static void argFromConsole(String[] args) {
        for (var x: args) {
            System.out.println(x);
        }
    }
    // 5 подзадача
    public static void harmonyNumbers() {
        for (int i = 0; i++ != 10;) {
            System.out.println(1.0 / i);
        }
    }
    // 6 подзадача
    public static void randomArray() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Введите кол-во элементов: ");
        } while ((n = scanner.nextInt()) < 0);

        int[] array = new int[n];

        System.out.println("Math.random()");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000000000);
        }
        System.out.println("Массив:");
        printArray(array);
        sort(array, Sorts.Bubble);
        System.out.println("Отсортированный массив:");
        printArray(array);

        System.out.println("Random");
        Random random = new Random(new Date().getTime());
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        System.out.println("Массив:");
        printArray(array);
        sort(array, Sorts.Bubble);
        System.out.println("Отсортированный массив:");
        printArray(array);
    }
    // 7 подзадача
    public static int factorial(int i) {
        if (i < 0) return -1;
        if (i <= 1) return 1;
        return i*factorial(i - 1);
    }
    public static void sort(int[] array, Sorts sort) {
        switch (sort) {
            case Bubble:
                bubbleSort(array);
                break;
        }
    }
    private static void bubbleSort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++){
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
