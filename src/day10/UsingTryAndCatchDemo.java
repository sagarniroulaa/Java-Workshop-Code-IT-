package day10;

/*
    try block -> Contains the code that might throw an exception.
    catch block -> Contains the code that handles the exception if it occurs.

    try {
        // code
    } catch(ExceptionType e) {
        // code
    }
*/

public class UsingTryAndCatchDemo {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            int result = x/y;
            System.out.println("Result: " + result);
        } catch(ArithmeticException e) {
            System.out.println("Exception details: " + e);
        }

        System.out.println("Program continues after handling ....");
    }
}
