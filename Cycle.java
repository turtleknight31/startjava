public class Cycle {
    public static void main(String[] args){

        for(int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }

        System.out.print(" \n");

        int i = -6; 
        while (i <= 6) {
            System.out.print(i + " ");
            i += 2;
        }

        System.out.print(" \n");

        int num = 10;
        int sum = 0;
        do {
            if(num % 2 == 1) {
                sum += num;
            }
            num++;
        } while (num <= 20);
        System.out.println("Сумма нечетных чисел равна: " + sum);
    }
}