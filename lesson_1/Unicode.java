public class Unicode {
    public static void main(String[] args) {
        for(int code = 33; code <= 126; code++) {
            char symbol = (char)(code);
            System.out.print(symbol + " ");
        }
    }
}