package day11.generics;

/*
    Array -> Fixed-sized container,
            Occupies memory location even if they are not holding meaningful values.

    ArrayList -> Resizable array implementation.
        1. Dynamic size.
        2. Stores only object (primitive types can't be stored).
        3. Comes with many utility methods.
        4. Generic -> It can specify the type it holds:
                ArrayList<Integer>
 */

import java.util.ArrayList;

public class ArraysVsArrayListDemo {
    public static void main(String[] args) {
        int[] nums = {1,2,3};

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.remove(0);

        int n = numbers.get(0);
        System.out.println(n);
        System.out.println(numbers); // toString()
    }
}
