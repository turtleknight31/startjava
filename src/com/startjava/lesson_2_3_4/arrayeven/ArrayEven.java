package src.com.startjava.lesson_2_3_4.arrayeven;

import java.util.Scanner;

public class ArrayEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N ");
        int n = scanner.nextInt();
        int[] mass = new int[n];
        System.out.println("Введите числа с пробелом: ");

        for(int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
        }

        int[] even = new int[n];
        int j = 0;
        for(int i = 0; i < n; i++) {
            if(mass[i] % 2 == 0) {
                even[j] = mass[i];
                j++;
            }
        }

        for(int i = 0; i < j; i++) {
            System.out.println("Число: " + even[i]);
        }
    }
}
