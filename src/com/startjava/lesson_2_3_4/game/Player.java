package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] enteredNumbers = new int[20];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getEnteredNumber(int number) {
        return enteredNumbers[number];
    }

    public void setEnteredNumber(int numbers, int arrayNumbers) {
        enteredNumbers[numbers] = arrayNumbers;
    }

    public void clearArray(int i) {
        Arrays.fill(enteredNumbers, 0, i, 0);
    }
}