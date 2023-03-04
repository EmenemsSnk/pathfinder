package com.cardgame.pathfinder.card.treasure;

import com.cardgame.pathfinder.card.Card;
import lombok.Getter;

@Getter
public class TreasureCard implements Card {
    private long id;
    private String name;
    private int value;
}
