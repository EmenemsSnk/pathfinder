package com.cardgame.pathfinder.player;

import com.cardgame.pathfinder.player.stuff.Backpack;
import com.cardgame.pathfinder.player.stuff.Equipment;
import com.cardgame.pathfinder.player.stuff.Hand;

public class Player {
    private static final int INITIAL_COMBAT_POINTS = 0;
    private int actualCombatPoints;
    private Level level;
    private Backpack backpack;
    private Equipment equipment;
    private Hand hand;

    public Player(Level level, Backpack backpack, Equipment equipment, Hand hand) {
        this.level = level;
        this.backpack = backpack;
        this.equipment = equipment;
        this.hand = hand;
        actualCombatPoints = INITIAL_COMBAT_POINTS;
    }

}
