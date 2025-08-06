package day5;

class Car2 {
    String brand;
    int year;

    Car2() {
        this("Honda");
//        this("Unknown", 0);
    }

    Car2(String brand) {
        this(brand, 2024);
    }

    Car2(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void display() {
        System.out.println(brand + " - " + year);
    }
}

public class ConstructorChainingDemo {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("Tesla");
        Car2 c3 = new Car2("Toyota", 2021);

        c1.display();
        c2.display();
        c3.display();
    }
}
