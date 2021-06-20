package src.com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String choice = "yes";
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Введите первое число: ");
            calculator.setNum1(scan.nextInt());

            System.out.print("Введите знак: ");
            calculator.setSign(scan.next());

            System.out.print("Введите второе число: ");
            calculator.setNum2(scan.nextInt());
            calculator.calculate();

            do {
                System.out.print("Вы хотите продолжить?[yes/no]: ");
                choice = scan.next();
                if(!choice.equals("no") && !choice.equals("yes")) {
                    System.out.println("Повторите пожалуйста ввод: ");
                }
            } while(!choice.equals("no") && !choice.equals("yes"));
        } while(choice.equals("yes"));
        System.out.println("Вы завершили вычисления!");
    }
}