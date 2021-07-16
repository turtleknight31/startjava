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

    public int getEnteredNumber(int index) {
        return enteredNumbers[index];
    }

    public void setEnteredNumber(int index, int number) {
        enteredNumbers[index] = number;
    }

    public void clearArray(int count) {
        Arrays.fill(enteredNumbers, 0, count, 0);
    }
}