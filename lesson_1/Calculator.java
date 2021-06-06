public class Calculator {
    public static void main(String[] args) {
        char sign = '^';
        double num1 = 3;
        double num2 = 2;
        double result = 1;
        
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
                result = result * num1;
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
