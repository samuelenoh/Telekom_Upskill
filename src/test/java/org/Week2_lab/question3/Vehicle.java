package org.Week2_lab.question3;

public abstract class Vehicle {

    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public abstract void accelerate();

    public void printDetailsAndAcceleration() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.print("Acceleration behavior: ");
        accelerate();
        System.out.println();
    }
}
