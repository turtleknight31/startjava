import java.util.Scanner;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    private int userNumber;
    private int computerNumber;
    private boolean who;
    private byte luckyShot;

    public int getComputerNumber() {
        return computerNumber;
    }

    public void setComputerNumber(int computerNumber) {
        this.computerNumber = computerNumber;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public boolean getWho() {
        return who;
    }

    public byte getLuckyShot() {
        return luckyShot;
    }

    public void guessN() {
        who = !who;
        luckyShot = 0;
        System.out.print("Введите число: ");
        userNumber = scanner.nextInt();
        if(computerNumber > userNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else if(computerNumber < userNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else{
        luckyShot = 1;
        }
    }
}