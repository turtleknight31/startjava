package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfChoice = new Wolf();
        wolfChoice.setMale("Man");
        System.out.println("Пол: " + wolfChoice.getMale());
        wolfChoice.setName("Alfa");
        System.out.println("Кличка волка: " + wolfChoice.getName());
        wolfChoice.setColor("White");
        System.out.println("Окрас волка: " + wolfChoice.getName());
        wolfChoice.setWeight(15.6f);
        System.out.println("Вес: " + wolfChoice.getWeight());
        wolfChoice.setAge(9);
        System.out.println("Возраст: " + wolfChoice.getAge());
        System.out.println("Метод walk: " + wolfChoice.walk());
        System.out.println("Метод sit: " + wolfChoice.sit());
        System.out.println("Метод run: " + wolfChoice.run());
        System.out.println("Метод howl: " + wolfChoice.howl());
        wolfChoice.hunt();
    }
}