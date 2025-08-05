package day4.strings;

public class EqualsDemo {

    // .equals() and ==
    // .equals()
    /*
        Checks if two objects have the same value/content.
     */
    // ==
    /*
        Checks if two references point to the same object in memory.
     */

    // String methods can be chained


    public static void main(String[] args) {
        String a = "Abc";
//        String b = "Abc";
        String b = new String("    Abc      ");

        System.out.println(a == b); // checks memory address

        System.out.println(a.equals(b));
        System.out.println(a + b.trim().toUpperCase());

    }

}
