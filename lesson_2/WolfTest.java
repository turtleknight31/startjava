public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfChoice = new Wolf();
        System.out.println("Пол: " + wolfChoice.male);
        System.out.println("Кличка волка: " + wolfChoice.name);
        System.out.println("Окрас волка: " + wolfChoice.color);
        System.out.println("Вес: " + wolfChoice.weight);
        System.out.println("Возраст: " + wolfChoice.age);
        System.out.println("Метод walk: " + wolfChoice.walk());
        System.out.println("Метод sit: " + wolfChoice.sit());
        System.out.println("Метод run: " + wolfChoice.run());
        System.out.println("Метод howl: " + wolfChoice.howl());
        wolfChoice.hunt();
    }
}