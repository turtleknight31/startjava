package src.com.startjava.lesson_2_3.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    private int userNumber;
    private int computerNumber = rand.nextInt(100) + 1;
    private boolean who;
    private Player first;
    private Player second;

    public GuessNumber(Player first, Player second) {
        this.first = first;
        this.second = second;
    }

    public void start() {
        do {
            who = !who;

            if(who) {
                System.out.print("Первый игрок ходит: ");
            } else {
                System.out.print("Второй игрок ходит: ");
            }

            userNumber = scanner.nextInt();

            if(computerNumber > userNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if(computerNumber < userNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                if(who) {
                    System.out.println(first.getName() + ", Поздравляю ты выиграл!!!");
                } else {
                    System.out.println(second.getName() + ", Поздравляю ты выиграл!!");
                }
                break;
            }
        } while(true);
    }
}