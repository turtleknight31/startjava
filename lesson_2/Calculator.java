public class Calculator {

    String sign;
    String choice = "yes";
    float num1;
    float num2;
    float result = 1;
    boolean cont;


    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getChoice() {
    return choice;
    }

    public void setCont(boolean cont) {
        this.cont = cont;
    }

    public boolean getCont() {
    return cont;
    }

    public void calculateNumbers() {
        switch(sign) {
            case "+":
                result = num1 + num2;
                System.out.println("Сумма num1 и num2 будет равным: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Разность num1 и num2 будет равным: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Умножения num1 и num2 будет равным: " + result);
                break;
            case "/":
                result = num1 / num2;
                System.out.println("Деления num1 и num2 будет равным: " + result);
                break;
                case "^":
                for(int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                System.out.println("num1 в степени num2 будет равным: " + result);
                break;
            case "%":
                result = num1 % num2;
                System.out.println("Остаток от деления будет равным: " + result);
                break;
            }
        }
}
