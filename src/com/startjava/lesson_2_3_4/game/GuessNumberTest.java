package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        do {
            Player playerOne = createPlayer(1);
            Player playerTwo = createPlayer(2);
            GuessNumber game = new GuessNumber(playerOne, playerTwo);
            game.start();
        } while (checkChoice());
    }

    public static Player createPlayer(int number) {
        System.out.print("Введите имя " + number + "го игрока: ");
        return new Player(scan.next());
    }

    public static boolean checkChoice() {
        String choice;
        System.out.print("Вы хотите продолжить? [yes/no]: ");
        do {
            choice = scan.next();
            if ((!choice.equals("no")) && (!choice.equals("yes"))) {
                System.out.println("Повторите пожалуйста ввод: ");
            }
        } while (!choice.equals("no") && !choice.equals("yes"));
        return choice.equals("yes");
    }
}