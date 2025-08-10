package day8.abstract_classes;

/*
    Shape -> Circle, Triangle, Line

    Abstract class:
        -> Defined using "abstract" keyword.
        -> Cannot be instantiated (can be used as reference variables).
        -> Can contain:
            1. Abstract methods (without implementation)
            2. Concrete methods (with implementation)
            3. Fields (instance variables)
        -> It just provides template for its subclasses.

    Abstract method:
         -> Declared, without a body.
         -> Eg. abstract void draw();
         -> Such methods must be overridden.

    When to use abstract classes?
        -> When I want to define a common base for all subclasses.

    Rules for Abstract Classes:
    1. If a class has any abstract method, the class must be abstract.
    2. An abstract class can have 0 or more abstract methods.
    3. Subclasses must override all abstract methods.
    4. Abstract classes can have constructors (called when subclass objects are created).
    5. Can have fields, concrete methods, and even static methods.
 */

abstract class Shape {
    abstract void draw();

    void move() {
        System.out.println("Moving shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle!");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Square!");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {

        Shape s = new Circle();
        s.draw();

        s.move();
    }
}
