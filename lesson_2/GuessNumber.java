import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    private int userNumber;
    private int computerNumber = rand.nextInt(99) + 1;
    private boolean who;
    private byte luckyShot = 0;
    private String firstName;
    private String secondName;

    public byte getLuckyShot() {
        return luckyShot;
    }

    public void firstPlayer() {
        Player first = new Player(scanner.nextLine());
        firstName = first.getName();
    }

    public void secondPlayer() {
        Player second = new Player(scanner.nextLine());
        secondName = second.getName();
    }

    public void start() {
        who = !who;

        if(who) {
            System.out.print("Первый игрок стреляет: ");
        } else {
            System.out.print("Второй игрок стреляет: ");
        }

        userNumber = scanner.nextInt();

        if(computerNumber > userNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else if(computerNumber < userNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else {
            luckyShot = 1;
            if(who) {
                System.out.println(firstName + ", Поздравляю ты выиграл!!!");
            } else {
                System.out.println(secondName + ", Поздравляю ты выиграл!!");
            }
        }
    }
}
