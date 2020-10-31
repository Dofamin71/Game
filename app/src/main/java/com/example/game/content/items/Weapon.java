package com.example.game.content.items;

public class Weapon extends Item {
    int dam, def;

    public Weapon(int size, int price, int dam, int def) {
        super(size, price);
        this.dam = dam;
        this.def = def;
    }
}
