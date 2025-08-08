package day7.final_keyword_demo;

/*
    "final" has 3 use cases:
        1. To create the named constant.
        2. To prevent overriding (Polymorphism).
        3. To prevent inheritance.
 */

class Circle {
    final double PI = 3.14159;

    void area(double radius) {
        System.out.println("Area: " + (PI * radius * radius));
    }
}

public class FinalToCreateConstantsDemo {
    public static void main(String[] args) {

        final int a = 3;
        // a = 5; // not possible to change constants.

        Circle c = new Circle();
        c.area(5);
    }
}
