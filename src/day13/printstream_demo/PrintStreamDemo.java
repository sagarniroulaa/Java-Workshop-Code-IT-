package day13.printstream_demo;

/* PrintStream
    java.io -> used to print data to an output stream.
    -> Prints characters, strings, numbers, and objects in a human
    readable form.

    Difference from other output streams:
    1. It never throws an IOException during printing.
    2. It has convenient methods like print(), println() and printf().
 */

import java.io.PrintStream;

/*
    System.out.println();
 */

public class PrintStreamDemo {
    public static void main(String[] args) {
        try {
            PrintStream ps = new PrintStream("src/day13/printstream_demo/message.txt");

            ps.println("Hello from PrintStream!");
            ps.println("This is written into a file, not the console.");
            ps.printf("Java version: %s%n", System.getProperty("java.version"));

            ps.close();
            System.out.println("Data written to message.txt successfully...");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
