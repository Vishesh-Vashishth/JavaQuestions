package com.Vishesh.Properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        shape.area();
        circle.area();
        triangle.area();
    }
}
