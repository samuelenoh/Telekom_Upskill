package org.Week2_lab.question1;

public class Circle extends Shape{

    public static void main(String[] args) {
        Circle circle = new Circle(5);

        System.out.println(" Area: " + circle.calculateArea());
        System.out.println(" Perimeter: " + circle.calculatePerimeter());
    }
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;

    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}