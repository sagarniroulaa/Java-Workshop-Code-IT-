package day4.string_builder;

public class StringBufferVsStringBuilder {

    /*
        Mutable classes, manipulate strings, java.lang package, common methods
     */

    /*
        Thread safety: All methods are synchronized.
        // Threads -> Multiple parts of our program runs concurrently.
        // sb.append("A"); sb.append("B");
        // StringBuilder: AB or BA
        // StringBuffer: AB
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // Missing or corrupted characters
        Runnable task = () -> {
            for (int i=0;i<1000;i++) {
                sb.append("A");
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
    }
}
