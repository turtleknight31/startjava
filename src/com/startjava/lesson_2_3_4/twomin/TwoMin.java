package com.startjava.lesson_2_3_4.twomin;

import java.util.Scanner;

public class TwoMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scanner.nextInt();
        int[] mass = new int[n];
        System.out.print("Введите через пробелы: ");

        for (int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
        }
        int min1 = mass[0];
        int min2 = mass[0];
        int[] index = new int[2];

        for (int i = 0; i < n - 1; i++) {
            if(min1 > mass[i + 1]) {
                min1 = mass[i + 1];
                index[0] = i + 1;
            } else if(min1 == mass[i + 1]) {
                min2 =  mass[i + 1];
                index[1] = i + 1;
            } else if((min1 != min2) && (min2 > mass[i + 1])) {
                min2 = mass[i + 1];
                index[1] = i + 1;
            }
        }
        System.out.println("Первый минимум: " + min1);
        System.out.println("Индекс первого минимума: " + index[0]);
        System.out.println("Второй минимум: " + min2);
        System.out.println("Индекс второго минимума: " + index[1]);
    }
}
