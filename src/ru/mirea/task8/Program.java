package ru.mirea.task8;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задание 1. Треугольная последовательностью");
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        int k = 0;

        if (n != 0)
            for (int i = 1, j = 1; k++ < n; ) {
                System.out.println(i);
                if (i == j) {
                    i++;
                    j = 1;
                }
                else j++;
            }

        System.out.println("Задание 2. От 1 до n.");
        System.out.print("Введите число n: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; System.out.println(++i));

        System.out.println("Задание 3. От A до B.");
        System.out.print("Введите число A и B: ");
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        for (int i = a < b? a: b; i < (a > b? a: b); i++){
            System.out.println(i);
        }
    }
}
