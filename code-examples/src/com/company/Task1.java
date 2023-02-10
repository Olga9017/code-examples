package com.company;
//Даны натуральные числа n и вещественные числа а1,
//а2, ..., an.
// Определить среднее арифметическое вещественных чисел

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Введите n");
        int n = sc.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++){
            System.out.println("Введите число");
            double number = sc.nextDouble();
            sum += number;
        }
        System.out.println("Среднее арифметическое" + " " + sum/n);
    }
}
