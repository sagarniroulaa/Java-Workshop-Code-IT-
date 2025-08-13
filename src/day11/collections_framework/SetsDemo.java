package day11.collections_framework;

/*
    Set doesn't allow duplicate elements.
    1. HashSet
    2. LinkedHashSet
    3. TreeSet (Naturally or via a comparator)
 */

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // We have to override equals() and hashCode().
    /*
        Set needs these two methods to check if two objects are duplicates.

        1. Does an existing object have the same hash code?
        2. If yes, then call equals() to check if objects are truly equal.
     */

    /*
        Annotations:

     */

    /*
    calls hashCode()
    picks a bucket
    then calls equals() method (if needed)
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if(o == null) return false;

        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() { // Object
        return Objects.hash(name, age);
    }

    @Override // compile-time check
    public String toString() {
        return name + " " + age;
    }
}

public class SetsDemo {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person("Bob", 30));
        people.add(new Person("Bob", 30));
        System.out.println(people);
    }
}
