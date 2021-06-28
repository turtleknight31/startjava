package src.com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();

        do {
            System.out.print("Введите выражение через пробел: ");
            Calculator calculator = new Calculator(scan.nextLine());
            System.out.println("Результат: " + calculator.calculate());
            calc.choice();
        } while(calc.getChoice().equals("yes"));
        System.out.println("Вы завершили вычисления!");
    }
}