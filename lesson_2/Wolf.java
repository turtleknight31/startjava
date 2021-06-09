public class Wolf {
    String male = "Woman";
    String name = "Alfa";
    String color = "White";
    float weight = 20.6f;
    int age = 5;

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