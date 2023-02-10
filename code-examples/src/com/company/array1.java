package com.company;
//Заполнить массив из десяти элементов значениями, вводимыми с клавиатуры
//в ходе выполнения программы
//расчет квадратного корня из любого элемента массива
// растчет средне арифметического двух любых элементов массива

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.util.Arrays.deepToString;

public class array1 {
    public static void main(String[] args) {

        Integer [] array = new Integer[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите 10 чисел");
        for(int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Введите номер элемента массива для поиска квадрата корня");
        System.out.println("Квадратный корень = " + sqrt(array[sc.nextInt()]));

        System.out.println("Введите номера двух элементов массива для поиска среднего арифметическкого");
        System.out.println("Среднее арифметическое = " + avg(array[sc.nextInt()],array[sc.nextInt()]));
        System.out.println(deepToString(array));
    }
    public static double sqrt (int element){
        return  Math.sqrt(element);

    }

    public static double avg(int element1, int element2){
        return  (element1 + element2) / 2.0;
    }
}
