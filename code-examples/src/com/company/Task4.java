package com.company;

import java.util.Scanner;

//Дано натуральное число
// 1. Определить его максимальную цифру
// 2. Определить его минимальную цифру
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int naturalNumber = sc.nextInt();

        int min = 9;
        int max = 0;
        while (naturalNumber !=0) {
            int digit = naturalNumber % 10;
            naturalNumber = naturalNumber / 10;
            if (digit > max){
                max = digit;
            }
            if (digit < min){
                min = digit;
            }
        }
        System.out.println(" Max = " + max);
        System.out.println("Min = " + min);
    }
}
