package day8.polymorphism;

class MathOperations {
    int add(int a, int b) {
        return a+b;
    }

    double add(double a, double b) {
        return a+b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompileTimePolymorphismDemo {
    // Method overloading -> Same method name, different parameter lists

    // Rules:
        /*
            1. Parameters must differ in type or number
            2. Return type can be different only if parameter list differs.
            3. Access modifiers can be anything. (private, public, protected, no modifier)
         */
    public static void main(String[] args) {
        MathOperations m  = new MathOperations();
        System.out.println(m.add(3, 4));
        System.out.println(m.add(2.5, 4.5));
        System.out.println(m.add(1, 2, 3));
    }
}
