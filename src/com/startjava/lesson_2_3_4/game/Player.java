package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

    private String names;
     int[] arrayNumbers = new int[20];

    public Player(String name) {
        this.names = name;
    }

    public Player() {
    }

    public String getName() {
        return names;
    }
}