package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static String choice = "yes";
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.print("Введите выражение через пробел: ");
            Calculator calculator = new Calculator(scan.nextLine());
            System.out.println("Результат: " + calculator.calculate());
            choice();
        } while(choice.equals("yes"));
        System.out.println("Вы завершили вычисления!");
    }

    public static void choice() {
        do {
            System.out.print("Вы хотите продолжить? [yes/no]: ");
            choice = scan.nextLine();
            if((!choice.equals("no")) && (!choice.equals("yes"))) {
                System.out.println("Повторите пожалуйста ввод: ");
            }
        } while(!choice.equals("no") && !choice.equals("yes"));
    }
}