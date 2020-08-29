package com.codeskittles.learning.designpatterns.creational.factory;

public class RedShip extends GalaganShip {

    public RedShip() {
        super(3);
    }

    @Override
    public void shoot() {
        System.out.println("Red Ship Shoots");
    }

    @Override
    public void kamikaze() {
        System.out.println("Red Ship Kamikaze ATTACK!!!!");
    }
}
