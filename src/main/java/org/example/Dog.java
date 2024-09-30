package org.example;

// Dog class extends Animal
public class Dog extends Animal {
    // Implementing the makeSound method for Dog
    // overrides animal method makeSound and replaces output
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}
