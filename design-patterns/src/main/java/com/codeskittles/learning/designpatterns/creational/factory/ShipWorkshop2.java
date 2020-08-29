package com.codeskittles.learning.designpatterns.creational.factory;

public class ShipWorkshop2 {

    public GalaganShip buildGalaganShip(String shipType) {

        // Delegate the Ship creation to the Factory. No more concrete instantiations here.
        GalaganShip galaganShip = SimpleGalaganShipFactory.INSTANCE.createGalaganShip(shipType);

        // Apply stealth paint
        galaganShip.paint();

        return galaganShip;

    }
}
