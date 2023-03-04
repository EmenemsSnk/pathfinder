package com.cardgame.pathfinder.player;

public class Level {
    public static final int MAX_LEVEL = 12;
    public static final int INITIAL_LEVEL = 1;
    private int currentLevel = 1;

    public Level() {
    }

    public void increaseLevel(int lvlValue){
        currentLevel+= lvlValue;
    }

    public void decreaseLevel(int lvlValue){
        currentLevel-= lvlValue;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }
}
