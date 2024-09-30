package org.example;

// Interface Vehicle
// access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends).
// why cant we just use override and therefore not use interface and stick with extends

public interface Vehicle {
    // Method to start the engine
    void startEngine();

    // Method to stop the engine
    void stopEngine();
}
