package day11.collections_framework;

/*
    CF -> Unified architecture for representing and manipulation groups of objects.
    ArrayList, Set, Map, Queue

    -> It standardizes using one set of interfaces, reusable algorithms.

    Provides:
    1. Interfaces -> List, Set, Map
    2. Implementations -> ArrayList, LinkedList, HashSet, HashMap
    3. Algorithms -> Utility methods for sorting, searching, etc.
        (java.util.Collections)

    CF Hierarchy:

        Iterable (interface) -> Collection (interface)

        Collection -> List, Set, Queue (interfaces)

        List -> ArrayList, LinkedList
        Set -> HashSet, TreeSet, LinkedHashSet
        Queue -> PriorityQueue

        Map (interface) -> HashMap, LinkedHashMap, TreeMap

    Iterable Interface:
        -> Root interface for all collections.
        -> Defines iterator() method for iterating through elements.

    Collection Interface:
        -> Extends Iterable.
        -> Defines methods: add(), remove(), size(), clear(), contains()

    List Interface:
        -> Ordered (maintains insertion order) elements, allows duplicates.
        -> We can access elements using index.
*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionsFrameworkDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        // addAll(Collection<? extends E> c)
        List<String> moreFruits = Arrays.asList("Cherry");
        fruits.addAll(moreFruits);

        // remove(Object o)
        fruits.remove("Apple");

        // removeAll(Collection<?> c)
        List<String> removeThese = Arrays.asList("Cherry");
        fruits.removeAll(removeThese);
        System.out.println(fruits);

        // clear()
//        fruits.clear();
//        System.out.println(fruits);

        System.out.println(fruits.contains("Apple"));
//        System.out.println(fruits.containsAll());

        // isEmpty()

        // size()
        System.out.println(fruits.size());

        fruits.add("Apple");

        Iterator<String> it = fruits.iterator();
        while(it.hasNext()) {
            System.out.println(it.next() + " ");
        }

        // forEach()
        fruits.forEach(f -> System.out.print(f+ " "));

        // removeIf(Predicate<? super E> filter)
    }
}
