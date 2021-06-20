package src.com.startjava.lesson_1.unicode;

public class Unicode {
    public static void main(String[] args) {
        for(int symbol = 33; symbol <= 126; symbol++) {
            System.out.print((char) symbol + " ");
        }
    }
}