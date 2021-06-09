public class Wolf {
    private String male;
    private String name;
    private String color;
    private float weight;
    private int age;

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public boolean walk() {
        System.out.print("Вы идете: ");
        return true;
    }

    public String sit() {
        return "Вы сели";
    }

    public int run() {
        System.out.print("Вы пробежали метров: ");
        return 5;
    }

    public String howl() {
        return "Воет";
    }

    public void hunt() {
        System.out.println("Охотничий режим активирован");
    }
}
