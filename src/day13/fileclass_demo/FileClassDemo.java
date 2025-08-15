package day13.fileclass_demo;

/*
    File Class
    -> Located in java.io packages.
    -> Represents the path to a file or directory.

    Can be used to:
    -> Create new files or directories.
    -> Delete files or directories.
    -> Check file or directory properties (exists, readable, writable, etc).
    -> List contents of directories.
    -> Can represent absolute or relative paths.

    Constructors:
    1. File(String pathname)
    2. File(String parent, String child)
    3. File(File parent, String child)

    File file1 = new File("data.txt");
    File file2 = new File("C:\\Users\\John\\data.txt"); // Absolute path
    File file3 = new File("C:\\Users\\John", "data.txt"); // parent + child

    Common methods:

    boolean exists() -> Checks if file/directory exists.
    boolean createNewFile() -> Returns false if already exists.
    boolean delete() -> Deletes file/directory.
    String getName() ->
    String getPath() -> Relative path
    String getAbsolutePath() -> Absolute path
    boolean isFile()
    boolean isDirectory()
    boolean canRead()
    boolean canWrite()
    String[] list() -> Lists names of files/directories inside the directory.
    File[] listFiles()
    long length() -> Returns the file size in bytes.
 */

import java.io.File;
import java.io.IOException;

public class FileClassDemo {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            if(file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists!");
            }

            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writeable: " + file.canWrite());
            System.out.println("Is File?: " + file.isFile());
            System.out.println("Length: " + file.length() + " bytes");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
