package com.codeskittles.learning.designpatterns.creational.factory;

public enum SimpleGalaganShipFactory {

    INSTANCE;

    public GalaganShip createGalaganShip(final String shipType) {
        GalaganShip galaganShip;

        // Based on the type of ship, we will instantiate a concrete Ship and
        // assign to the GalaganShip instance variable.
        if ("RED".equals(shipType)) {
            galaganShip = new RedShip();
        } else if ("BLUE".equals(shipType)) {
            galaganShip = new BlueShip();
        } else if ("PURPLE".equals(shipType)) {
            galaganShip = new PurpleShip();
        } else if ("BOSS".equals(shipType)) {
            galaganShip = new GyarubossShip();
        } else {
            throw new IllegalArgumentException("Unsupported Ship Type");
        }

        return galaganShip;
    }

}
