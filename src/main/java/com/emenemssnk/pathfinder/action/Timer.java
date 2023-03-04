package com.cardgame.pathfinder.action;

public class Timer {
    private static final int SECONDS_FOR_MOVE = 120;
    private static final int SECONDS_FOR_BATTLE = 10;
    private static final int SECONDS_FOR_NEGOTIATION = 10;
    private final int initialTime;
    private int currentTime;

    public Timer(int initialTime) {
        this.initialTime = initialTime;
        this.currentTime = initialTime;
    }

    public int getTimeLeft() {
        return currentTime;
    }
}
