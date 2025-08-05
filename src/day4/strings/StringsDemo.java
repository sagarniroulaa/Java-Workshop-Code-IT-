package day4.strings;

public class StringsDemo {
    public static void main(String[] args) {

        // String -> Sequence of characters
        // It is defined in java.lang.String.
        // Used to store and manipulate texts.

        // In Java, Strings are immutable.
        // Immutable -> int x = 5; x = 2;
        // String myString = "Hello"; // SCP - String Constant Pool

        String greet = "Hello World!";
        greet += " Java";
        System.out.println(greet);
        // Use cases:
        /*
            User input, File Paths, URL, Logging
            JSON, XML, APIs, Data display
         */
        // Easier to manipulate, split, join, search, format

        // Memory Management
        /*
            Excessive memory usage (especially in loops)
            Slower performance (due to string immutability)
         */

        // String Constant Pool and Heap Memory
        // SCP - Special memory area in JVM, for storing string literals.

        String a = "Something";
        String b = "Something";

        System.out.println(b);
        String c = new String("Something"); // heap memory ma space xa
//        String c = new String("Something");

    }
}
