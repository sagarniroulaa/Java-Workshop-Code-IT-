package day10;

/*
    General form:
        throw ThrowableInstance;
 */

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }

    static void checkAge(int age) {
        if(age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above.");
        }

        System.out.println("Access granted.");
    }
}
