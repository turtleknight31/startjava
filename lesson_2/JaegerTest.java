public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Black Maria", "Mark-III", "Mexico", 320.4f, 418.54f, 45, 4, 6);
        Jaeger jaegerTwo = new Jaeger("Gipsy Danger", "Mark-III", "USA", 340.5f, 450.54f, 50, 5, 8);

        System.out.println("Модель 1: " + jaegerOne.getModuleName());
        System.out.println("Модель 2: " + jaegerTwo.getModuleName());
        System.out.println("Марка 1: " + jaegerOne.getMark());
        System.out.println("Марка 2: " + jaegerTwo.getMark());
        System.out.println("Страна 1: " + jaegerOne.getOrigin());
        System.out.println("Страна 2: " + jaegerTwo.getOrigin());
        System.out.println("Высота 1: " + jaegerOne.getHeight());
        System.out.println("Высота 2: " + jaegerTwo.getHeight());
        System.out.println("Вес 1: " + jaegerOne.getWeight());
        System.out.println("Вес 2: " + jaegerTwo.getWeight());
        System.out.println("Скорость 1: " + jaegerOne.getSpeed());
        System.out.println("Скорость 2: " + jaegerTwo.getSpeed());
        System.out.println("Сила 1: " + jaegerOne.getStrength());
        System.out.println("Сила 2: " + jaegerTwo.getStrength());
        System.out.println("Броня 1: " + jaegerOne.getArmor());
        System.out.println("Броня 2: " + jaegerTwo.getArmor());
    }
}
