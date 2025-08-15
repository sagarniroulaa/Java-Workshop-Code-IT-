package day13.file_io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("src/day13/file_writer_output.txt");
            int ch;
            while((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fr != null) fr.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
