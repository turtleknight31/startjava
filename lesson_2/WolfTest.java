public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfChoice = new Wolf();
        wolfChoice.male = "Woman";
        System.out.println("Пол: " + wolfChoice.male);
        wolfChoice.name = "Alfa";
        System.out.println("Кличка волка: " + wolfChoice.name);
        wolfChoice.color = "White";
        System.out.println("Окрас волка: " + wolfChoice.color);
        wolfChoice.weight = 20.6f;
        System.out.println("Вес: " + wolfChoice.weight);
        wolfChoice.age = 5;
        System.out.println("Возраст: " + wolfChoice.age);
        System.out.println("Метод walk: " + wolfChoice.walk());
        System.out.println("Метод sit: " + wolfChoice.sit());
        System.out.println("Метод run: " + wolfChoice.run());
        System.out.println("Метод howl: " + wolfChoice.howl());
        wolfChoice.hunt();
    }
}
