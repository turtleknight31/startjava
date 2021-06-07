import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int UserNumber = 0;
        int ComputerNumber = 45;
        do {
            System.out.print("Введите число: ");
            UserNumber = scanner.nextInt();
            if(ComputerNumber > UserNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if(ComputerNumber < UserNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            }
        } while(ComputerNumber != UserNumber);
        System.out.println("УРА УРА УРА! Поздравляю, число угадано!: " + UserNumber);
    }
}
