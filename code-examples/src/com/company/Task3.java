package com.company;
//Дана не пустая последовательность целых чисел, оканчивающаяся нулем.
// Найти сумму всех чисел последовательности;
// Количество всех чисел последовательности;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите несколько чисел, после ввода  0 ввод считается законченным");

        int number = 0;
        int sum = 0;
        int count = 0;
        do {
            number = sc.nextInt();
            sum += number;
            count++;
        }while (number !=0);
        System.out.println("Сумма всех чисел = "+ sum);
        System.out.println("Количество всех чисел = "+ count);
    }

}
