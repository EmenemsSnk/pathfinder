package com.cardgame.pathfinder.player.stuff;

import com.cardgame.pathfinder.card.treasure.EquipmentCard;
import java.util.ArrayList;
import java.util.List;

public class Equipment {
    private final List<EquipmentCard> cards = new ArrayList<>();
    private final int maxArmourCount = 1;
    private final int maxWeaponCount = 2;
    private final int maxBootsCount = 1;
    private final int maxHelmetCount = 1;
    private final int maxHeavyCount = 1;
    private final int initialArmourCount = 0;
    private final int initialWeaponCount = 0;
    private final int initialBootsCount = 0;
    private final int initialHelmetCount = 0;
    private final int initialHeavyCount = 0;
    private boolean hasHeavyEquipment;
    private boolean hasArmour;
    private boolean hasFreeArms;
    private boolean hasBoots;
}
