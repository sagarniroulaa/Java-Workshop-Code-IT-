package day11.generics;

// ArrayList -> It stores data as Object.
// Before Generics, the problem was, the list could hold any type of objects.
/*
    Problems:
        1. No type checking at compile-time.
        2. Everytime you get something, you have to manually cast.
        3. Mixing types by mistake was easy.
 */

/*
    After Java 5:
    Generics brought compile-time type safety to Collections.
 */
import java.util.ArrayList;

public class GenericsDemo {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("Hello"); // 0
        list.add(123); // 1

        String s = (String) list.get(1); // ClassCastException at runtime!
    }
}
