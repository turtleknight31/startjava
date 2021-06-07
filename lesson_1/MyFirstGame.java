import java.util.Scanner;
public class MyFirstGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        int number = 45;
        while(number != a) {
            if(number > a) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                System.out.println("Введите число: ");
                a = scanner.nextInt();
            } else if(number < a) {
                System.out.println("Данное число больше того, что загадал компьютер");
                System.out.println("Введите число: ");
                a = scanner.nextInt();
            }
        }
        System.out.println("УРА УРА УРА! Поздравляю, число угадано!: " + a);
    }
}