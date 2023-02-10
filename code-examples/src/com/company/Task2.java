package com.company;
//Имеется фрагмент программы в виде оператора цикла с параметром,
// обеспечивающий вывод на экран "столбиком" всех целых чисел от 10 до 30
// Оформить этот фрагмент в виде
// 1. оператора цикла с предусловием;
// 2. опретора цикла с постусловием;

public class Task2 {
    public static void main(String[] args) {
        for (int i = 10; i < 30; i++){
            System.out.println(i);
        }
        // пример цикла do while
        int start = 10;
        do {
            System.out.println(start);
            start++;
        }while (start < 30);

        // пример цикла  while
        int startWhile = 10;
        while (startWhile < 30) {
            System.out.println(startWhile);
            startWhile++;

        }
    }
}
