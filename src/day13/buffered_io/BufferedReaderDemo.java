package day13.buffered_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// BufferedReader ma I can read a line of String directly using readline() method.
/*
    BufferedReader -> readLine() (reads an entire line at once).
    BufferedWriter -> newLine() (write a platform-independent newline).
 */

public class BufferedReaderDemo {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("src/day13/buffered_writer_output.txt"));
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null) {
                try {
                    if(br != null) br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
