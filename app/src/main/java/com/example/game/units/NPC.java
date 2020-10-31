package com.example.game.units;

import com.example.game.content.gameplay.Inventory;

public class NPC extends Base {
    public NPC(String name, String type, Inventory inventory) {
        super(name, type, inventory);
    }

    void speak() {}
}
