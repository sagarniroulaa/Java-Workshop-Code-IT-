package day7.inheritance;

// Dynamic Method Dispatch
/*

*/

class Animal4 {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog4 extends Animal4 {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class VariableReferencingDemo {
    public static void main(String[] args) {
        Animal4 a;
        a = new Dog4();

        a.makeSound();
    }
}
