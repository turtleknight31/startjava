package src.com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
    private String cal;
    private String choice = "yes";
    Scanner scan = new Scanner(System.in);

    public Calculator(String cal) {
        this.cal = cal;
    }

    public Calculator() {
    }

    public String getChoice() {
        return choice;
    }


    public int calculate() {
        String[] words = cal.split(" ");
        int num1 = Integer.parseInt(words[0]);
        int num2 = Integer.parseInt(words[2]);

        switch(words[1]) {
            case "+":
                return Math.addExact(num1, num2);
            case "-":
                return Math.subtractExact(num1, num2);
            case "*":
                return Math.multiplyExact(num1, num2);
            case "/":
                return num1 / num2;
            case "^":
                return (int) Math.pow(num1, num2);
            case "%":
                return num1 % num2;
        }
        return 0;
    }

    public String choice() {
        do {
            choice = "yes";
            System.out.print("Вы хотите продолжить?[yes/no]: ");

            choice = scan.nextLine();
            if((!choice.equals("no")) && (!choice.equals("yes"))) {
                System.out.println("Повторите пожалуйста ввод: ");
            }
        } while(!choice.equals("no") && !choice.equals("yes"));
        return choice;
    }
}