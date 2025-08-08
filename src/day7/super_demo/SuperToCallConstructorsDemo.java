package day7.super_demo;

class Animal {
    String name;

    // Superclass constructor
    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called for: " + name);
    }

    void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
        System.out.println("Dog constructor called for breed: " + breed);
    }
}

public class SuperToCallConstructorsDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("sajdhsad", "irewfe");
        System.out.println(myDog.name);
        System.out.println(myDog.breed);
    }
}
