package day13.file_io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("src/day13/file_writer_output.txt");
            fw.write("Hello, from FileWriter Demo file!");
            System.out.println("Data written successfully...");
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) fw.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
