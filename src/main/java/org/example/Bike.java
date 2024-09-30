package org.example;

// Bike class implements Vehicle
public class Bike implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Bike engine started. Zoom Zoom!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Bike engine stopped.");
    }
}

