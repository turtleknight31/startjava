package src.com.startjava.lesson_2_3.calculator;

public class Calculator {

    public String sign;
    public float num1;
    public float num2;

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public void calculate() {
        switch(sign) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "^":
                float result = 1;
                for(int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                System.out.println("num1 в степени num2 будет равным: " + result);
                break;
            case "%":
                System.out.println(num1 % num2);
                break;
        }
    }
}