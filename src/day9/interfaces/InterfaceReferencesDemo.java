package day9.interfaces;

/*
    Interface reference can point to any object of a class that implements it.

    This is a core principle of Polymorphism ->
    the ability to write code that works on objects of different classes through
    a common interface type.

    An interface reference variable has knowledge only of the methods declared by its
    interface declaration.
 */

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }

    public void getRadius() {
        System.out.println("This is your radius.");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class InterfaceReferencesDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.draw(); // Circle ko draw() method

        Shape s2 = new Rectangle();
        s2.draw(); // Rectangle ko draw() method

        // Computer -> Laptop, Desktop
        // Computer comp = emp.getComputer();
    }
}
