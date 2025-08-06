package day5;

public class PillarsOfOOP {
    /*
        1. Encapsulation
            - Wrapping of data and methods into a single unit (class).
            - Control access to data via access modifiers.

        2. Inheritance
            - Parent class -> Child class
            - Child class inherits properties and methods from parent class.
            // Car -> Sports, Sedan

        3. Polymorphism
            - Same method name, different behaviors
            - i> Compile-time polymorphism e.g. Method overloading.
            - ii> Run-time polymorphism e.g. Method overriding.

        4. Abstraction
            - Hiding complex implementation details, expose only what's necessary.

        // Why OOP?

        1. Real-world mapping
            - Models software close to how we think about the world.

        2. Code reuse
            - Write once, reuse via inheritance.

        3. Scalability
            - Easy to extend and modify.

        4. Maintainability
            - Changes are easy to implement.

        // Real-world scenario
        I want to build a ride-sharing app.
        Objects: Driver, Passenger, Car, Trip

        Encapsulation: (Car Object) fields-> speed, fuel level;
                                    methods -> accelerate(), refuel();

        Inheritance: ElectricCar and PetrolCar extend Car, refuel() implementation changes.

        Polymorphism: calculateFare() -> StandardTrip or LuxuryTrip

        Abstraction: They just have to press "Book Ride".
     */
}
