package org.Week2_lab.question3;

public class Test {
    public static void main(String[] args) {
        // Create objects of Car and Bike
        Car car = new Car("BMW", "C300", 2023);
        Bike bike = new Bike("Suzuki", "Vax", 2023);

        // Print details and acceleration behavior of Car and Bike
        System.out.println("Car Details:");
        car.printDetailsAndAcceleration();

        System.out.println("Bike Details:");
        bike.printDetailsAndAcceleration();
    }
}

