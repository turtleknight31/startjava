public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger();

        jaegerOne.setModuleName("Black Maria");
        jaegerTwo.setModuleName("Gipsy Danger");
        jaegerOne.setMark("Mark-III");
        jaegerTwo.setMark("Mark-III");
        jaegerOne.setOrigin("Mexico");
        jaegerTwo.setOrigin("USA");
        jaegerOne.setHeight(320.4f);
        jaegerTwo.setHeight(340.5f);
        jaegerOne.setWeight(418.54f);
        jaegerTwo.setWeight(450.54f);
        jaegerOne.setSpeed(45);
        jaegerTwo.setSpeed(50);
        jaegerOne.setStrength(4);
        jaegerTwo.setStrength(5);
        jaegerOne.setArmor(6);
        jaegerTwo.setArmor(8);

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

        //System.out.println("Высота: " + jaegerOne.height);
        //jaegerOne.height = -5;
        //System.out.println("Высота: " + jaegerOne.height);

        /*System.out.println("Марка: " + jaegerOne.mark);
        System.out.println("Скорость: " + jaegerOne.speed);
        System.out.println("Метод дрифт: " + jaegerOne.drift());*/
    }
}