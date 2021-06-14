import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choice = "yes";
        
        do {
            GuessNumber game = new GuessNumber();
            System.out.print("Введите имя первого игрока: ");
            game.firstPlayer();
            System.out.print("Введите имя второго игрока: ");
            game.secondPlayer();
        
            do {
                game.start();
            } while(game.getLuckyShot() != 1);
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
