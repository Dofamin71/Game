package com.example.game.units.classes;

import com.example.game.content.gameplay.Inventory;
import com.example.game.units.Unit;

public class Wizard extends Unit {
    public Wizard(String name, String type, Inventory inventory, int hp, int lvl, int str, int def) {
        super(name, type, inventory, hp, lvl, str, def);
    }
}
