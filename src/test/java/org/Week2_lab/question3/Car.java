package org.Week2_lab.question3;

public class Car extends Vehicle{

    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerates by pressing the gas pedal.");
    }
}
