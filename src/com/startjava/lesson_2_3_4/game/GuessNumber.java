package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    private int userNumber;
    private int computerNumber = rand.nextInt(100) + 1;
    private boolean who;
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() {
        int i = makeMove();

        System.out.print("Все значения первого  игрока: ");
        showEnteredNumbers(0);
        System.out.print("\n");
        System.out.print("Все значения второго  игрока: ");
        showEnteredNumbers(1);
        System.out.print("\n");
        playerOne.clearArray(i);
    }

    public int makeMove() {
        int i = 0;
        do {
            isWho();
            userNumber = scanner.nextInt();
            playerOne.setEnteredNumber(i, userNumber);
            if (computerNumber > userNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (computerNumber < userNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                if (who) {
                    System.out.println(playerOne.getName() + ", Поздравляю ты выиграл!!!");
                    System.out.println(playerOne.getName() + " Угадал с попытки " + ((i + 2)/ 2));
                } else {
                    System.out.println(playerTwo.getName() + ", Поздравляю ты выиграл!!");
                    System.out.println(playerTwo.getName() + " Угадал с попытки " + ((i + 2)/ 2));
                }
            }
            if (i == 18) {
                System.out.println("У пользователя " + playerOne.getName() + " закончились попытки");
            } else if (i == 19) {
                System.out.println("У пользователя " + playerTwo.getName() + " закончились попытки");
                System.out.print("\n");
                break;
            }
            i++;
        } while(computerNumber != userNumber);
        return i;
    }

    public void isWho() {
        who = !who;
        if (who) {
            System.out.print("Первый игрок ходит: ");
        } else {
            System.out.print("Второй игрок ходит: ");
        }
    }

    public void showEnteredNumbers(int k) {
        for (int j = k; j < 20; j+=2) {
            if (playerOne.getEnteredNumber(j) != 0) {
                System.out.print(" " + playerOne.getEnteredNumber(j));
            }
        }
    }
}







