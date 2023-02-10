package com.company;
import java.util.Random;
//Дан массив. Определить:
//максимальный элемент
//минимальный элемент
//индекс максимального элемента
//индекс минимального элемента
//поменять местами макс и мин элементы
public class array3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[r.nextInt(10)];

        for (int i = 0; i < array.length; i++){
            array[i] = r.nextInt(100);
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min){
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("\nMax = " + max + " " + "index = " + maxIndex);
        System.out.println("Min = " + min + " " + "index = " + minIndex);


        array[maxIndex] = min;
        array[minIndex] = max;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
