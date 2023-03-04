package com.cardgame.pathfinder.player.stuff;

import com.cardgame.pathfinder.card.treasure.TreasureCard;
import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private final List<TreasureCard> cards = new ArrayList<>();
    private int value;

    public void addItem(TreasureCard treasureCard) {
        cards.add(treasureCard);
    }

    public void removeItem(TreasureCard treasureCard) {
        cards.remove(treasureCard);
    }

    public void sellItem(TreasureCard treasureCard) {
        cards.remove(treasureCard);
    }

    public void sellChosenItems(TreasureCard treasureCard) {
        cards.remove(treasureCard);
    }

    public void sellAllItems(TreasureCard treasureCard) {
        cards.remove(treasureCard);
    }

    public void putItemToHand(TreasureCard treasureCard) {
        cards.remove(treasureCard);
    }

    public void putItemToEquipment(TreasureCard treasureCard) {
        cards.remove(treasureCard);
    }

    public void exchangeItem(TreasureCard treasureCard) {
        cards.remove(treasureCard);
    }

    private void calculateValue() {
        value = cards.stream().mapToInt(TreasureCard::getValue).sum();
    }
}
