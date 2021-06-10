import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculateNum = new Calculator();


        Scanner numbers = new Scanner(System.in);
        Scanner sign = new Scanner(System.in);

        do {
            System.out.print("Введите первое число: ");
            calculateNum.setNum1(numbers.nextInt());

            System.out.print("Введите знак: ");
            calculateNum.setSign(sign.nextLine());

            System.out.print("Введите второе число: ");
            calculateNum.setNum2(numbers.nextInt());
            calculateNum.calculateNumbers();

            do {
                System.out.print("Вы хотите продолжить?[yes/no]: ");
                calculateNum.setChoice(sign.nextLine());
                if(calculateNum.getChoice().equals("no")) {
                    System.out.println("Вы завершили вычисления!");
                    calculateNum.setCont(true);
                } else if(calculateNum.getChoice().equals("yes")) {
                    calculateNum.setCont(true);
                } else {
                    System.out.println("Повторите пожалуйста ввод: ");
                    calculateNum.setCont(false);
                }
            } while(!calculateNum.getCont());
        } while(calculateNum.getChoice().equals("yes"));
    }
}