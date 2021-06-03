public class Variable {
    public static void main(String[] args) {
        byte ram = 12;
        short ssd = 223;
        int horizontal = 1366;
        long vertical = 768;
        float frequency = 2.49f;
        double weight = 1.5;
        char wifi = 'Y';
        boolean bluetooth = true;
        System.out.println("Оперативная память: " + ram);
        System.out.println("Обьем SSD: " + ssd);
        System.out.println("Разрешение экрана: " + horizontal + "x" + vertical);
        System.out.println("Частота процессора: " + frequency);
        System.out.println("Вес устройства: " + weight);
        System.out.println("Наличия wifi: " + wifi);
        System.out.println("Наличия bluetooth: " + bluetooth);
    }
}
