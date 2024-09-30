package org.example;

// Car class implements Vehicle
public class Car implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Car engine has started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine has stopped.");
    }
}
