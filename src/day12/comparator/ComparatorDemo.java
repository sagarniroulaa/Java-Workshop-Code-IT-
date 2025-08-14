package day12.comparator;

/*
    Comparator is one of the functional interfaces.
    Used to define custom ordering(sorting) logic for objects.

    int compare(T o1, T o2);
    Here, -ve: if o1 should come before o2.
            0: if equal.
          +ve: if o1 should come after o2.

    Some methods:
    1. reversed(): Reverses the order.
    2. comparing(): Makes comparator using a key extractor.
    3. thenComparing(): Chains another comparator.
    4. naturalOrder(): Returns a comparator that uses natural ordering.
 */

import java.util.*;

class Student {
    private String name;
    private int marks;

    public Student (String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", marks=" + marks + "]";
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        // Anonymous Class
//        Comparator<Student> marksComparator = new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return Integer.compare(o2.getMarks(), o1.getMarks());
//            }
//        };

        Comparator<Student> marksAndNameComparator = Comparator
                .comparing((Student s) -> s.getMarks()).thenComparing((Student s) -> s.getName()).reversed();

//        Comparator<Student> gComparator =
//                (s1, s2) -> Integer.compare(s1.getMarks(), s2.getMarks());

        List<Student> students = new ArrayList<>();
        students.add(new Student("Ram", 85));
        students.add(new Student("Shyam", 64));
        students.add(new Student("Hari", 96));

        Collections.sort(students, marksAndNameComparator);

        System.out.println(students);
        /*
        int -> Integer.compare(a, b);
        float -> Float.compare(a, b);
        double -> Double.compare(a, b);
        boolean -> Boolean.compare(a, b);
        String -> a.compareTo(b);
         */

        List<String> names = Arrays.asList("Ram", "Shyam", "Hari");
        names.sort(Comparator.naturalOrder());
        System.out.println(names);

    }
}
