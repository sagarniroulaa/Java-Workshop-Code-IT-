package day4.strings;

public class StringInterningDemo {
    public static void main(String[] args) {
        // String interning -> Multiple strings with same value should be stored only once,
        // which must be immutable.

        // .intern() -> Works with SCP

        String s1 = new String("Hello");
        String s2 = s1.intern();
        String s3 = "Hello";

        System.out.println(s2 == s3);

        // Why String Interning?
        /*
            Reduce memory usage
            Improves performance for equality checks
         */
    }
}
