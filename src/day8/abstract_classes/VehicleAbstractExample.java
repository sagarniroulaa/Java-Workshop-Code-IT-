package day8.abstract_classes;

abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started with a key");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike started with kick");
    }
}

public class VehicleAbstractExample {
    public static void main(String[] args) {
        Vehicle v;
        v = new Car();

        v.start();
        v.stop();
    }
}
