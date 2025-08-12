package day10;

/*
    Throws:
        -> Used to indicate that the method might throw certain exceptions.
        -> Used for checked exceptions.

    Syntax:
        public void methodName() throws ExceptionType1, ExceptionType2 {
            // code
        }
 */

public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (java.io.IOException e) {
            System.out.println("Caught exception: " + e);
        }
    }

    static void readFile() throws java.io.IOException {
        throw new java.io.IOException("File not found!");
    }
}
