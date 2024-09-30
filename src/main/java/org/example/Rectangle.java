package org.example;

// Rectangle class derived from Shape
// is it private so it doesnt clash with other shapes with the same variable
public class Rectangle extends Shape {
    private final double width;
    private final double height;

    // Constructor to initialize width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Overriding the calculateArea method for Rectangle
    @Override
    public double calculateArea() {
        return width * height; // Area of a rectangle
    }
}
