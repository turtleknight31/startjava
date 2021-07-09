package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    static String choice;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            System.out.print("Введите имя первого игрока: ");
            Player playerOne = new Player(scan.next());
            System.out.print("Введите имя второго игрока: ");
            Player playerTwo = new Player(scan.next());
            GuessNumber game = new GuessNumber(playerOne, playerTwo);
            game.start();
        } while (isNext());

    }

    public static boolean isNext() {
        do {
            System.out.print("Вы хотите продолжить? [yes/no]: ");
            choice = scan.next();
            if ((!choice.equals("no")) && (!choice.equals("yes"))) {
                System.out.println("Повторите пожалуйста ввод: ");
            }
        } while (!choice.equals("no") && !choice.equals("yes"));
        return choice.equals("yes");
    }
}