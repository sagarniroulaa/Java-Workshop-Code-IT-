package day8;

public class VarargsDemo {
    /*
    Varargs -> This allows any method to accept 0 or more arguments
                of the same type.
            -> Introduced in Java 5.
            -> Helps avoid writing multiple overloaded methods for different
                argument counts.

     Rules for Varargs:
     1. Only one varargs parameter per method.
     2. Must be the last parameter in the method signature.
     3. Can be combined with regular parameters.
     */

    static void sum(int... numbers) {
        int total = 0;
        for(int n: numbers) {
            total += n;
        }

        System.out.println("Sum: " + total);
    }

    public static void main(String[] args) {
        sum();
        sum(5);
        sum(1, 2);
        sum(1, 2, 3, 4, 5);
    }
}
