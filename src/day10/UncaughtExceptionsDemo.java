package day10;

/*
    Class Name
    Method Name
    File Name
    Line number
    Type of Exception thrown
 */

/*
    Stack Trace: Shows the sequence of method calls that led to that error.
                -> Printed from the most recent method call (error happened)
                 up to the earliest call (main).
 */

public class UncaughtExceptionsDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        int result = x / y; // This will throw ArithmeticException
        System.out.println(result);
    }
}
