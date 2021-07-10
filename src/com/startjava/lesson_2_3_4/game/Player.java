package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int[] enteredNumbers = new int[20];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getEnteredNumbers(int number) {
        return enteredNumbers[number];
    }

    public void setEnteredNumbers(int numbers, int arrayNumbers) {
        this.enteredNumbers[numbers] = arrayNumbers;
    }
}