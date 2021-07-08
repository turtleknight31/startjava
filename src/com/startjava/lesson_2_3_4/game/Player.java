package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int[] arrayNumbers ;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getArrayNumbers(int val) {
        return arrayNumbers[val];
    }

    public void setArrayNumbers(int[] arrayNumbers) {
        this.arrayNumbers = new int[arrayNumbers.length];
        System.arraycopy(arrayNumbers, 0, this.arrayNumbers, 0, arrayNumbers.length);
    }
}