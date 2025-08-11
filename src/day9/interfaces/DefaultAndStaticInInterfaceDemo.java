package day9.interfaces;

/*
    Default methods: They have a body inside an interface.
                    -> we use "default" keyword.
    Static methods: They belong to the class/interface itself.
 */

interface Mammal {
    void eat(); // public, abstract

    default void sleep() {
        System.out.println("Mammal sleeping...");
    }

    static void info() {
        System.out.println("This is a Mammal interface.");
    }
}

class Cat implements Mammal {
    @Override
    public void eat() {
        System.out.println("Cat eats something.");
    }
}

public class DefaultAndStaticInInterfaceDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        Mammal.info();
    }
}
