package com.codeskittles.learning.designpatterns.creational.factory;

public class GyarubossShip extends GalaganShip {

    public GyarubossShip() {
        super(5);
    }

    @Override
    public void shoot() {
        System.out.println("Gyaruboss Ship Shoots");
    }

    @Override
    public void kamikaze() {
        System.out.println("Gyaruboss Ship Kamikaze ATTACK!!!!");
    }

    @Override
    public void paint() {
        System.out.println("Painting Gyaruboss Ship with Reflective Coating.");
    }
}

