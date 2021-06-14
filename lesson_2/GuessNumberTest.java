import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        GuessNumber guessNumberGo = new GuessNumber();
        System.out.print("Первый игрок: ");
        Player firstPlayer = new Player(scan.nextLine());
        System.out.print("Второй игрок: ");
        Player secondPlayer = new Player(scan.nextLine());

        guessNumberGo.setComputerNumber(rand.nextInt(99) + 1);

        do {
            guessNumberGo.guessN();
        } while(guessNumberGo.getLuckyShot() != 1);

        if(guessNumberGo.getWho()) {
            System.out.println(firstPlayer.getName() + ", Поздравляю ты выиграл!!");
        } else {
            System.out.println(secondPlayer.getName()+ ", Поздравляю ты выиграл!!");
        }
    }
}