package com.startjava.lesson_1.game;

import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber = 0;
        int computerNumber = 45;
        do {
            System.out.print("Введите число: ");
            userNumber = scanner.nextInt();
            if(computerNumber > userNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if(computerNumber < userNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            }
        } while(computerNumber != userNumber);
        System.out.println("УРА УРА УРА! Поздравляю, число угадано!: " + userNumber);
    }
}