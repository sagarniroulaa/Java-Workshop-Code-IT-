package day7.inheritance;

// Superclass
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Subclass
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking.");
    }
}

public class InheritanceDemo {
    /*
        Creating new classes from existing ones.
        Child class inherits properties and methods from parent class.
        Analogy: Car -> SportsCar

        superclass -> Parent class
        subclass -> Child classes

        "extends" keyword to inherit from the superclass.
        General form:

        class subclass-name extends superclass-name {
            // body
        }
     */
    public static void main(String[] args) {
        // Animal and Dog
        Dog d = new Dog();
        d.name = "Bruno";

        d.eat(); // Inherited from Animal
        d.sleep(); // Inherited from Animal
        d.bark(); // Defined in Dog
    }
}
