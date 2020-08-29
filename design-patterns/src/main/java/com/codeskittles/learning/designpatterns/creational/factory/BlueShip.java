package com.codeskittles.learning.designpatterns.creational.factory;

public class BlueShip extends GalaganShip {

    public BlueShip() {
        super(1);
    }

    @Override
    public void shoot() {
        System.out.println("Blue Ship Shoots");
    }

    @Override
    public void kamikaze() {
        System.out.println("Blue Ship Kamikaze ATTACK!!!!");
    }
}
