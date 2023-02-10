package com.company;//Используя датчик случайных чисел, заполнить массив из двадцати
//элементов. Вывести полученные массивы на экран.
//1.Все неотрицательные элементы
//2.Все элементы непревышающие 100

import java.util.Random;

import static java.util.Arrays.deepToString;

public class array2 {
    public static void main(String[] args) {
        Double[] array = new Double[20];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextDouble();
        }
        System.out.println(deepToString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 100) {
                System.out.print(array[i] + " ");

            }
        }
    }
}