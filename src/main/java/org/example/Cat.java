package org.example;

// Cat class extends Animal
public class Cat extends Animal {
    // Implementing the makeSound method for Cat
    // overrides animal method makeSound and replaces output
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}
