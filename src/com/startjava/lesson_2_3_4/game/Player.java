package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int[] enteredNumbers;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getEnteredNumbers(int val) {
        return enteredNumbers[val];
    }

    public void setEnteredNumbers(int[] enteredNumbers) {
        this.enteredNumbers = new int[enteredNumbers.length];
        System.arraycopy(enteredNumbers, 0, this.enteredNumbers, 0, enteredNumbers.length);
    }
}