package src.com.startjava.lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        char sign = '^';
        float num1 = 3.4f;
        float num2 = 5f;
        float result = 1.0F;

        if(sign == '+') {
            result = num1 + num2;
            System.out.println("Сумма num1 и num2 будет равным: " + result);
        } else if(sign == '-') {
            result = num1 - num2;
            System.out.println("Разность num1 и num2 будет равным: " + result);
        } else if(sign == '*') {
            result = num1 * num2;
            System.out.println("Умножения num1 и num2 будет равным: " + result);
        } else if(sign == '/') {
            result = num1 / num2;
            System.out.println("Деления num1 и num2 будет равным: " + result);
        } else if(sign == '^') {
            for(int i = 1; i <= num2; i++) {
                result *= num1;
            }
            System.out.println("num1 в степени num2 будет равным: " + result);
        } else if(sign == '%') {
            result = num1 % num2;
            System.out.println("Остаток от деления будет равным: " + result);
        } else {
            System.out.println("Вы ввели не корректный символ, введите пожалуйста заново: " + sign);
        }
    }
}