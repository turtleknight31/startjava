package src.com.startjava.lesson_2_3_4.maxnegativenumber;


import java.util.Scanner;

public class MaxNegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пожалуйста размер массива: ");
        int n = scanner.nextInt();
        int[] mass = new int[n];
        System.out.print("Введите числа через пробелы: ");

        for(int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
        }
        int index = -1;
        int[] maxN = new int[1];
        for(int i = 0; i < n ; i++) {
            if((mass[i] < 0) && (index < 0)) {
                index = i;
                maxN[0] = mass[index];
            } else if((mass[i] < 0) && (mass[i] > mass[index])) {
                maxN[0] = mass[index];
            }
        }
        System.out.println("Максимальное отрицательное число: " + maxN[0]);
    }
}
