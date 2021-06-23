package src.com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String choice = "yes";
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();

        do {
            System.out.print("Введите выражение через пробел: ");
            calculator.setCal(scan.nextLine());
            calculator.calculate();
            System.out.println("Результат: " + calculator.getResult());

            do {
                System.out.print("Вы хотите продолжить?[yes/no]: ");
                choice = scan.nextLine();
                if((!choice.equals("no")) && (!choice.equals("yes"))) {
                    System.out.println("Повторите пожалуйста ввод: ");
                }
            } while(!choice.equals("no") && !choice.equals("yes"));
        } while(choice.equals("yes"));
        System.out.println("Вы завершили вычисления!");
    }
}