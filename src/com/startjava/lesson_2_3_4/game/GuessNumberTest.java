package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choice = "yes";

        do {
            System.out.print("Введите имя первого игрока: ");
            Player player1 = new Player(scan.next());
            System.out.print("Введите имя второго игрока: ");
            Player player2 = new Player(scan.next());

            System.out.println(player1.getName());
            System.out.println(player2.getName());
            GuessNumber game = new GuessNumber(player1.getName(), player2.getName());
            game.start();

            do {
                System.out.print("Вы хотите продолжить?[yes/no]: ");
                choice = scan.next();
                if(!choice.equals("no") && !choice.equals("yes")) {
                    System.out.println("Повторите пожалуйста ввод: ");
                }
            } while(!choice.equals("no") && !choice.equals("yes"));
        } while(choice.equals("yes"));
    }
}