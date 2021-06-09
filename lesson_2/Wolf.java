public class Wolf {
    String male;
    String name;
    String color;
    float weight;
    int age;

    boolean walk() {
        System.out.print("Вы идете: ");
        return true;
    }

    String sit() {
        return "Вы сели";
    }

    int run() {
        System.out.print("Вы пробежали метров: ");
        return 5;
    }

    String howl() {
        return "Воет";
    }

    void hunt() {
        System.out.println("Охотничий режим активирован");
    }
}
