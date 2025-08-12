package day10;

// Order matters in multiple catch.
// Once an exception occurs, Java immediately jumps to the first matching catch block,
//  and skips the rest of the try block.

public class MultipleCatchDemo {
    public static void main(String[] args) {
        String str = null; // This can cause NullPointerException
        int[] numbers = {1, 2, 3};

        try {
            System.out.println(str.length()); // NullPointerException
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
            int result = 10/0;
        }
        catch(NullPointerException e) {
            System.out.println("Null object accessed!");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        }
        catch(ArithmeticException e) {
            System.out.println("Can't divide by zero!");
        }

        System.out.println("After everything!");
    }
}
