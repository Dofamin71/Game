package com.example.game.units.npc;

import com.example.game.content.gameplay.Inventory;
import com.example.game.units.Base;

public class Trader extends Base {
    private String speech;

    public Trader(String name, String type, Inventory inventory) {
        super(name, type, inventory);
    }

    private void trade(int gold) {
        speech = ("-- \"Лучшие товары по лучшим ценам!\" --\n\n" +
                "       У тебя есть " + gold + " золота.\n\n" +
                "1) Зелье здоровья - 50 золотых.\n" +
                "2) Зелье опыта - 100 золотых.\n\n\n");
    }
}
