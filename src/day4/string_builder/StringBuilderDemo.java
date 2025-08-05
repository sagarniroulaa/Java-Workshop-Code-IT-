package day4.string_builder;

public class StringBuilderDemo {
    // StringBuilder
    /*
        allows creation of mutable strings (sequence of characters).
        java.lang.StringBuilder
        without creating new objects, we can modify strings
        this is not thread-safe (StringBuffer)
     */
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" World");
        System.out.println(sb.toString());
    }
}
