import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choice = "yes";

        do {
            System.out.print("Введите имя первого игрока: ");
            Player first = new Player(scan.next());
            System.out.print("Введите имя второго игрока: ");
            Player second = new Player(scan.next());
            GuessNumber game = new GuessNumber(first, second);
            game.start();

            do {
                System.out.print("Вы хотите продолжить?[yes/no]: ");
                choice = scan.next();
                if(!choice.equals("no") && !choice.equals("yes")) {
                    System.out.println("Повторите пожалуйста ввод: ");
                }
            } while(!choice.equals("no") && !choice.equals("yes"));
        } while(choice.equals("yes"));
    }
}