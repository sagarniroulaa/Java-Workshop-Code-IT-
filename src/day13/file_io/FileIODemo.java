package day13.file_io;

/*
    File I/0: Process of reading data from files
               and writing data to files.
    Defined in packages: java.io, java.nio

    File I/O: 1. Storing program output permanently.
              2. Loading configuration data.
              3. Logging application events.


    Streams:
        -> Sequence of data.
        -> 1. Input Stream: Reads data from a source.
        -> 2. Output Stream: Writes data to a destination.

    Types of streams:
        1. Byte Streams (read/write binary data)
        Classes: FileInputStream, FileOutputStream
                BufferedInputStream, BufferedOutputStream

        2. Character Streams (read/write text data)
        Classes: FileReader, FileWriter, BufferedReader, BufferedWriter

    Character Streams vs Byte Streams:
    Character:
        1. Work with text data (unicode).
        2. Classes extend Reader and Writer.
        3. Sutable for reading/writing .txt, .csv, .xml, .json files.
        4. Automatically converts characters to/from bytes internally.
        5. Read/write 2 bytes at a time.

    Byte:
        1. Work with raw binary data (sequence of bytes).
        2. Classes extend InputStream and OutputStream.
        3. Suitable for reading/writing images, videos, audio, PDFs, etc.
        4. Read/write 1 byte at a time.

    InputStream -> FileInputStream, BufferedInputStream
    OutputStream -> FileOutputStream, BufferedOutputStream

    Reader -> FileReader, BufferedReader
    Writer -> FileWriter, BufferedWriter

    1. InputStream(Byte input)
    Main method: int read() -> Reads a byte at a time (returns -1 if at end of stream).

    2. OutputStream(Byte output)
    Main method: void write(int b) -> Writes a byte

    3. Reader(Character input)
    Main method:
    int read() -> Reads a single character.
    int read(char[] charArr) -> Reads characters into an array.

    4. Writer(Character output)
    Main method:
    void write(String str) -> Writes a string.
 */

public class FileIODemo {
}
