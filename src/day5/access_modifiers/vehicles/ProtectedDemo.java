package day5.access_modifiers.vehicles;

import day5.access_modifiers.garage.SportsCar;

public class ProtectedDemo {
    public static void main(String[] args) {
        SportsCar myCar = new SportsCar();
        myCar.showBrand();

        Car c = new Car();
        c.printBrand();

        day5.access_modifiers.garage.Car c1 = new day5.access_modifiers.garage.Car();
    }
}
