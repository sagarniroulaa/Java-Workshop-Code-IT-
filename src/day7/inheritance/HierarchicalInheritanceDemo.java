package day7.inheritance;

// Why not Multiple Inheritance?
/*
    Parent Class -> A
    B extends A, C extends A
    D extends B, C

    If both B and C classes have a method with the same signature, it is unclear
    which method should be called.

    hello()
 */

class Animal3 {
    void eat() {
        System.out.println("eat");
    }
}

class Dog3 extends Animal3 {
    void bark() {
        System.out.println("bark");
    }
}

class Cat extends Animal3 {
    void meow() {
        System.out.println("meow");
    }
}

public class HierarchicalInheritanceDemo {
    // B, C, D -> A
    public static void main(String[] args) {

    }
}
