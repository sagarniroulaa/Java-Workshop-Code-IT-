package day6.autoboxing;

public class TypeWrappersDemo {

    // int double = 32;
    // Primitive types -> Object (Type Wrappers)
    // Primitive types are used for the sake of performance.

    // Primitive types -> They are not part of Object hierarchy, they
    // dont inherit Object.

    // Type Wrappers: Integer, Double, Float, Long, Short, Byte, Character, Boolean

    //      static Integer valueOf(int val);
    //      int intValue();

    // Similar to all the above type wrappers.

    // Autoboxing:  Process by which a primitive type is automatically encapsulated
    // into its equivalent type wrapper.

    // Auto-unboxing: Process by which the value of a boxed object is extracted
    // automatically from a type wrapper.
    // Integer iOb = Integer.valueOf(100);


    public static void main(String[] args) {
        Integer iOb = 100; // autoboxing of an integer

        int i = iOb; // auto-unboxing of an integer
        System.out.println(i + " " + iOb);
    }
}
