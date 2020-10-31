package com.example.game.units;

import com.example.game.content.gameplay.Inventory;

public abstract class Base {
    public String type, name;
    public Inventory inventory;

    public Base(String name, String type, Inventory inventory) {
        this.name = name;
        this.type = type;
        this.inventory = inventory;
    }
}
