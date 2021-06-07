import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int usernumber = 0;
        int computernumber = 45;
        do {
            System.out.print("Введите число: ");
            usernumber = scanner.nextInt();
            if(computernumber > usernumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if(computernumber < usernumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            }
        } while(computernumber != usernumber);
        System.out.println("УРА УРА УРА! Поздравляю, число угадано!: " + usernumber);
    }
}
