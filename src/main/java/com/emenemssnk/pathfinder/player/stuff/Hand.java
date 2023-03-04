package com.cardgame.pathfinder.player.stuff;

import com.cardgame.pathfinder.card.Card;
import java.util.ArrayList;
import java.util.List;

public class Hand {
    public static final int MAX_NUMBER_OF_CARDS = 6;
    private final List<Card> cards = new ArrayList<>(MAX_NUMBER_OF_CARDS);

    public List<Card> getCards() {
        return cards;
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void useCard(Card card) {
//        card.makeAction?
    }

    public void putToBackpack(Card card, Backpack backpack) {

    }

    public void putToEquipment(Card card, Equipment equipment) {

    }

    public void throwAway(Card card) {

    }
}
