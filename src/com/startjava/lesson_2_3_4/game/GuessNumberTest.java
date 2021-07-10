package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            enteredPlayers();
        } while (isNext());
    }

    public static boolean isNext() {
        return checkChoice().equals("yes");
    }

    public static void enteredPlayers() {
        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(scan.next());
        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player(scan.next());
        GuessNumber game = new GuessNumber(playerOne, playerTwo);
        game.start();
    }

    public static String checkChoice() {
        String choice;
        System.out.print("Вы хотите продолжить? [yes/no]: ");
        do {
            choice = scan.next();
            if ((!choice.equals("no")) && (!choice.equals("yes"))) {
                System.out.println("Повторите пожалуйста ввод: ");
            }
        } while (!choice.equals("no") && !choice.equals("yes"));
        return choice;
    }
}