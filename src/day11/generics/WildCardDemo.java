package day11.generics;

import java.util.Arrays;
import java.util.List;

/*
    ? (unbounded wildcard) -> Any type
    ? extends T -> Unknown type that is a subclass T
    ? super T -> Unknown type that is a superclass of T
 */
public class WildCardDemo {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Something");
        List<Integer> numbers = Arrays.asList(10, 15, 20);

        printList(strings);
        printList(numbers);
    }
}
