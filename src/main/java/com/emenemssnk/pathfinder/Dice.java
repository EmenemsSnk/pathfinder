package com.cardgame.pathfinder;

public class Dice {

    /*private static final Random RANDOM = new Random();*/
    private static final int MAX_DICE_VALUE = 6;

    public static int roll() {
        return (int) (Math.random() * MAX_DICE_VALUE);
    }

}
