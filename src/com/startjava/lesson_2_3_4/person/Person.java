package com.startjava.lesson_2_3_4.person;

public class Person {

    String male = "Man";
    String name = "Nurzat";
    float height = 1.75f;
    float weight = 65.5f;
    int age = 23;

    void go() {
        System.out.println("Вы идете");
    }

    String sit() {
        return "Вы сели";
    }

    boolean run() {
        return true;
    }

    void talk() {
        System.out.println("Вы говорите");
    }

    String studyJava() {
        return "activated";
    }
}