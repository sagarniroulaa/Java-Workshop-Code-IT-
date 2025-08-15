package day13.buffered_io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
    FileReader, FileWriter -> Directly reads/writes characters from/to a file.
    BufferedReader, BufferedWriter -> Data is first stored in buffer (memory), and only read/\
                                written to disk in bigger chunks.
 */

public class BufferedWriterDemo {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("src/day13/buffered_writer_output.txt"));
            bw.write("Hello line");
            bw.newLine();
            bw.write("Second line");
            System.out.println("Data written successfully...");
        } catch(IOException e) {
            e.printStackTrace();
        }  finally {
            try {
                if(bw != null) bw.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
