package day12.comparator;

/*
    Comparable: Another functional interface.
    Defines natural ordering for objects.

    int compareTo(T o);
    Here,
    -ve: current object comes before o.
    +ve: current object comes after o.
    0: current object is equal to o.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student1 implements Comparable<Student1> {
    int id;
    String name;

    public Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student1 o) {
        return o.id - this.id;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student1> list = Arrays.asList(
                new Student1(3, "Ram"),
                new Student1(1, "Shyam"),
                new Student1(6, "Hari")
        );

        Collections.sort(list);
        System.out.println(list);
    }
}
