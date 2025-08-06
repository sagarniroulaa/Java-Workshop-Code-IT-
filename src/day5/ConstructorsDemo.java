package day5;

class Bike {
    String brand;
    int year;

    // User-defined no-argument constructor
    Bike() {
        brand = "Hero";
        year = 2024;
    }

    // Parameterized Constructor
    Bike(String brand) {
        this.brand = brand;
    }

    Bike(String b, int y) {
        brand = b;
        year = y;
    }

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class ConstructorsDemo {
    // Constructors:
    /*
        - Special method in a class,
        that is automatically called when creating an object.
        - Characteristics: 1. Same name as the class.
                        2. No return type (not even void).
                        3. Can be overloaded.

        // Why use a constructor?
        1. Saves time.
        2. Ensures objects are created with valid data.
        3. Makes code cleaner.

        // Types of Constructors:
            1. Default Constructor
            - Java automatically provides a default one.

            2. No-Argument Constructor (User-defined default)
            -  User defined constructors without parameters.

            3. Parameterized Constructor
            - A constructor with parameters to initialize an object.
     */
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.showDetails();

        Bike b2 = new Bike("Honda");
        b2.showDetails();

        Bike b3 = new Bike("Bajaj", 2023);
        b3.showDetails();
    }
}
