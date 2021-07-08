package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    private int userNumber;
    private int computerNumber = rand.nextInt(100) + 1;
    private boolean who;
    private String player1;
    private String player2;
    int[] arrayNumbers = new int[20];
    Player player = new Player();

    public GuessNumber(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int i = 0;
        do {
            isWho();
            userNumber = scanner.nextInt();
            arrayNumbers[i] = userNumber;
            player.setArrayNumbers(arrayNumbers);
            if (computerNumber > userNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (computerNumber < userNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                if (who) {
                    System.out.println(player1 + ", Поздравляю ты выиграл!!!");
                    System.out.println(player1 + " Угадал с попытки " + (i / 2 + 1));
                } else {
                    System.out.println(player2 + ", Поздравляю ты выиграл!!");
                    System.out.println(player2 + " Угадал с попытки " + (i / 2 + 1));
                }
                voidNumber();
                System.out.print("\n");
                Arrays.fill(arrayNumbers, 0, i, 0);
                break;
            }

            if (player.getArrayNumbers(18) != 0) {
                System.out.println("У пользователя " + player1 + " закончились попытки");
            } else if (player.getArrayNumbers(19) != 0) {
                System.out.println("У пользователя " + player2 + " закончились попытки");
                voidNumber();
                System.out.print("\n");
                break;
            }
            i++;
        } while(true);
    }

    public void isWho() {
        who = !who;
        if (who) {
            System.out.print("Первый игрок ходит: ");
        } else {
            System.out.print("Второй игрок ходит: ");
        }
    }

    public void voidNumber() {
        System.out.print("Все значения первого  игрока: ");
        for (int j = 0; j < 20; j+=2) {            //Можно уже использовать геттер
            if (player.getArrayNumbers(j) != 0) {
                System.out.print(" " + player.getArrayNumbers(j));
            }
        }
        System.out.print("\n");
        System.out.print("Все значения второго  игрока: ");
        for (int j = 1; j < 20; j+=2) {
            if (player.getArrayNumbers(j) != 0) {
                System.out.print(" " + player.getArrayNumbers(j));
            }
        }
    }
}







