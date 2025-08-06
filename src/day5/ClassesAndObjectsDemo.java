package day5;

// Class:
    // doesn't occupy heap memory (ClassLoader -> Put into method area)
// Object:
    // stored in heap memory

class Car1 {
    // Fields
    String brand;
    int year;

    // Method (Behavior)
    void start() {
        System.out.println(brand + " is starting ....");
    }
}

public class ClassesAndObjectsDemo {
    /*
        Class:
            - Blueprint or a template from which objects are created.
            - Define data (fields/attributes/instance variable). -> what the object has.
            - Defines behavior (methods). -> what the object does
            - Analogy: Class is a blueprint of a house.
                        Object is an actual house built from that blueprint.

         // Creating functions
    // Syntax:
    /*
        return_type function_name(Parameters) {
            // function body
        }
       // Object - Instance of a class.
                 - Created using "new" keyword.
                 - Each object has its own copy of fields and
                 can call methods defined in its class.
     */

    public static void main(String[] args) {
        Car1 myCar = new Car1(); // Heap memory ma space allocate garxa new le
        myCar.brand = "BYD";
        myCar.year = 2025;

        myCar.start();
    }
}
