package day3.arrays;

import java.util.Arrays;
import java.util.Objects;

public class ArrayDemo {

    public static void main(String[] args) {

        // Syntax:
//        dataType[] arrayName = new dataType[size];
        // Stack and Heap Memory in Java

        // Data Areas in JVM
        // 1. Stack Memory
            // - Used to store local variables
            // - Faster, but smaller
        // 2. Heap Memory
            // - Used to store obejcts of arrays, strings, or any class instance
            // - Bigger, but a bit slower


        int a = 5; // stack ma a | 5, marks | mem.address
        int[] marks = new int[7];
        marks[0] = 1;
        marks[1] = 10;
        System.out.println(marks);

        // hashCode -> buckets,

        // Metadata (like length, type info)
        // The actual values: 1, 2, 3

        int[] mark = {85, 90, 23, 34, 12, 23, 44};

        System.out.println(mark[5]);

        System.out.println(mark.length);

//        for(int i=0;i<mark.length;i++) {
//            System.out.println(mark[i]);
//        }

        // Enhanced for loop
        for(int n: mark) {
            System.out.println(n);
        }
    }
}
