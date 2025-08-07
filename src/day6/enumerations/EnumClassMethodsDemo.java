package day6.enumerations;

enum Color {
    RED, GREEN, BLUE;
}

public class EnumClassMethodsDemo {

    // parent class: java.lang.Enum
    // Several methods are defined in Enum:
    /*
        1. final int ordinal()
        -> Returns the ordinal value (starts from 0)

        2. final int compareTo(enum-type e)
        -> Returns -ve value if invoking constant has ordinal value less than e's.
        -> Returns 0 if same.

        3. public boolean equals(Object other)
        -> Enum class overrides this method defined by Object.
        -> Two enum constants will be equal
            only if they both refer to the same constant (within same enumeration).
     */

    public static void main(String[] args) {
        Color c1 = Color.RED;
        Color c2 = Color.GREEN;
        Color c3 = Color.RED;

        // ordinal()
        System.out.println("Ordinal of RED is: " + c1.ordinal());
        System.out.println("Ordinal of GREEN is: " + c2.ordinal());
        System.out.println("Ordinal of BLUE is: " + Color.BLUE.ordinal());

        // compareTo()
        System.out.println("c1.compareTo(c2): " + c1.compareTo(c2));
        System.out.println("c1.compareTo(c3): " + c1.compareTo(c3));
        System.out.println("c2.compareTo(c1): " + c2.compareTo(c1));

        // ==
        // equals()
        System.out.println("c1.equals(c2): " + c1.equals(c2));
        System.out.println("c1.equals(c3): " + c1.equals(c3));

        System.out.println("c1.equals(c3): " + (c1==c3));
    }
}
