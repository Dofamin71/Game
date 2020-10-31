package com.example.game.units.classes;

import com.example.game.content.gameplay.Inventory;
import com.example.game.units.Unit;

public class Warrior extends Unit {
    public Warrior(String name, String type, Inventory inventory, int hp, int lvl, int str, int def) {
        super(name, type, inventory, hp, lvl, str, def);
    }
}
