package com.example.game.units;

import com.example.game.content.gameplay.Inventory;
import com.example.game.units.classes.Actions;

public class Unit extends Base implements Actions {
    public int hp, lvl, str, def;

    public Unit(String name, String type, Inventory inventory, int hp, int lvl, int str, int def) {
        super(name, type, inventory);
        this.hp = hp;
        this.lvl = lvl;
        this.str = str;
        this.def = def;
    }

    @Override
    public void attack() {

    }

    @Override
    public void trade() {

    }

    @Override
    public void speak() {

    }
}
