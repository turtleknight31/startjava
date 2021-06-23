package src.com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private String cal;
    private int result;

    public int getResult() {
        return result;
    }

    public void setCal(String cal) {
        this.cal = cal;
    }

    public void calculate() {
        String[] words = cal.split(" ");
        int num1 = Integer.parseInt(words[0]);
        int num2 = Integer.parseInt(words[2]);

        switch(words[1]) {
            case "+":
                result = Math.addExact(num1, num2);
                break;
            case "-":
                result = Math.subtractExact(num1, num2);
                break;
            case "*":
                result = Math.multiplyExact(num1, num2);
                break;
            case "/":
                result = num1 / num2;
                break;
            case "^":
                result = (int) Math.pow(num1, num2);
                break;
            case "%":
                result = num1 % num2;
                break;
        }
    }
}