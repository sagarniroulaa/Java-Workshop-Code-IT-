package day10;

/*
    Finally block -> Optional
                   -> Code always executes regardless of whether an exception was
                   thrown or caught.
                   -> Typically used for cleanup actions like closing files,
                   releasing resources, or cleaning up connections.

    Syntax:
        try {
            // code
        }
        catch(ExceptionType e) {
            // code
        }
        finally {
            // code that always runs
        }

        Code inside finally always runs, even if:
        1. An exception was thrown or caught.
        2. There was a return inside the try or catch.
        3. The program flow leaves the try-catch block abruptly.
 */

public class FinallyDemo {

    static int someMethod() {
        try {
            // code....
            return 5;
        } catch(ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        finally {
            System.out.println("After everything. Cleaning up....");
        }

        return 10;
    }

    public static void main(String[] args) {
//        try {
//            int data = 10/0;
//        }
//        catch(ArithmeticException e) {
//            System.out.println("Caught: " + e.getMessage());
//        }

//        System.out.println("Finally block executed.");

        someMethod();

    }
}
