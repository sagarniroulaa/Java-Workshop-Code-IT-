package day9;

/*
    Functional Interfaces:
        Those interfaces which contain exactly one abstract method.
        We can use lambda expression. () -> { };
        They can have multiple default or static methods.

        @FunctionalInterface

        Comparator
        Comparable
 */

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class FunctionalInterfacesDemo {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        System.out.println("Sum using lambda: " + addition.calculate(1, 2));
    }
}
