package day5.access_modifiers.vehicles;

/*
class Car {
    String brand = "Toyota";
}
*/

class Car {
    protected String brand = "Toyota";

    protected void printBrand() {
        System.out.println("Brand: " + brand);
    }
}
