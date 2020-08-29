package com.codeskittles.learning.designpatterns.creational.factory;

public abstract class GalaganShip implements ShipCapabilities {

    protected int armourStrength;

    protected GalaganShip(final int armourStrength) {
        this.armourStrength = armourStrength;
    }

    public void paint() {
        System.out.println("Painting the ship with Stealth coating");
    }
}
