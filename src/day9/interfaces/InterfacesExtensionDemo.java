package day9.interfaces;

/*
    class -> can extend other classes
    interface -> can extend other interfaces
 */

interface Animal2 {
    void eat();
}

interface Pet2 extends Animal2 {
    void play();
}

class Dog2 implements Pet2 {
    @Override
    public void play() {
        System.out.println("Dog plays fetch.");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bones.");
    }
}

public class InterfacesExtensionDemo {
    public static void main(String[] args) {
        Pet2 p = new Dog2();
        p.eat();
        p.play();
    }
}
