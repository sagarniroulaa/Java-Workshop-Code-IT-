package day13.file_io;

/*
    When working with files,
    it is important to close them after reading or writing.

    Closing a file:
        1. Frees system resources.
        2. Ensures all data is written to disk.
        3. Prevents file corruption.

    Traditionally, we always close files inside "finally" block.
    Java 7 -> "try-with-resources" statement.

 */

import java.io.FileWriter;
import java.io.IOException;

public class AutomaticClosingOfFileDemo {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("src/day13/automatic_close.txt")) {
            fw.write("Hello, Auto-closing the file!");
            System.out.println("Data written successfully.");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
