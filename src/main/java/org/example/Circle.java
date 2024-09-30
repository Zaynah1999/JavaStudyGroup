package org.example;

// Circle class derived from Shape
// as this is a public class is needed its own file
public class Circle extends Shape {
    // when should i use private or double for fields
    // initially made public but intellij made private
    private final double radius;

    // Constructor to initialize the circle's radius
    public Circle(double radius) {

        this.radius = radius;
    }

    // Overriding the calculateArea method for shape
    @Override
    public double calculateArea() {

        return Math.PI * radius * radius; // Area of a circle
    }
}
