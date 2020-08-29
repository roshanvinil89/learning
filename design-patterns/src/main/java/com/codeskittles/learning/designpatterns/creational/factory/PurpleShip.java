package com.codeskittles.learning.designpatterns.creational.factory;

public class PurpleShip extends GalaganShip {

    public PurpleShip() {
        super(2);
    }

    @Override
    public void shoot() {
        System.out.println("Purple Ship Shoots");
    }

    @Override
    public void kamikaze() {
        System.out.println("Purple Ship Kamikaze ATTACK!!!!");
    }

}
