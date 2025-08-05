package day4.string_builder;

public class StringFormattingDemo {

    // .format()
    // Format Specifiers
    /*
        %s (String), % (Integer), %f (Floating point), %.2f (2 digits precision)
        , %n (\n), %c (character)
     */

    public static void main(String[] args) {
        String name = "Hari";
        int score = 90;

        System.out.printf("%-10s | %5d%n", name, score);
    }
}
