package day8.polymorphism;

class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

public class RuntimePolymorphismDemo {
    /*
        Method overriding -> Subclass provides its own implementation of a method
            already defined in its superclass.

        The method in subclass must have the same:
            1. Name
            2. Return type
            3. Parameters

        Dynamic Method Dispatch:
            -> Animal obj = new Dog();
          -> Call to an overridden method is resolved at runtime.
          -> Actual object type is used to decide which method to execute.

         Rules for Method Overriding:
         1. Method must have same name and parameters as in superclass.
         2. Return type must be the same.
         3. Cannot override final methods.
         4. Cannot override static methods.
     */
    public static void main(String[] args) {

        Animal a;
        a = new Dog(); // superclass reference, subclass object
        a.makeSound(); // Bark (Dog's method is called)

        a = new Cat();
        a.makeSound(); // Meow
    }
}
