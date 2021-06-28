package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private  String Expression;

    public Calculator(String mathExpression) {
        this.Expression = mathExpression;
    }

    public int calculate() {
        String[] words = Expression.split(" ");
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
}