package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    static boolean isNext;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.print("Введите выражение через пробел: ");
            Calculator calculator = new Calculator(scan.nextLine());
            System.out.println("Результат: " + calculator.calculate());
            choice();
        } while(!isNext);
        System.out.println("Вы завершили вычисления!");
    }

    public static void choice() {
        String choice;
        do {
            System.out.print("Вы хотите продолжить? [yes/no]: ");
            choice = scan.nextLine();
            if((!choice.equals("no")) && (!choice.equals("yes"))) {
                System.out.println("Повторите пожалуйста ввод: ");
            }
            if(choice.equals("no")) {
                isNext = true;
            }
        } while(!choice.equals("no") && !choice.equals("yes"));
    }
}