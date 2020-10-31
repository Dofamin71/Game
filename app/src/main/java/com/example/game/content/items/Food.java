package com.example.game.content.items;

public class Food extends Item {
    int saturation;

    public Food(int size, int price, int saturation) {
        super(size, price);
        this.saturation = saturation;
    }
}
