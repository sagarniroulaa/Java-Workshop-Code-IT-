package day10;

/*
    try {
        // code
        try {
            // code
        }
        catch(ExceptionType e) {
            // code
        }
    }
    catch(ExceptionType e) {
        //
    }

 */

public class NestedTryBlockDemo {
    public static void main(String[] args) {
        try {
            try {
                int a = 10/0; // ArithmeticException
            } catch(ArithmeticException e) {
                System.out.println("Exception caught! Divide by zero.");
            }

            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught! Array index out of bounds.");
        }
    }
}
