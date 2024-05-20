package org.Week2_lab.question3;

public class Bike extends Vehicle{
    public Bike(String make, String model, int year) {
        super(make, model, year);
    }
    @Override
    public void accelerate() {
        System.out.println("Bike accelerates by twisting the throttle.");
    }

}