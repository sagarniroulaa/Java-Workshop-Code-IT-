package day11.collections_framework;

/*
    Stores in key-value pairs.
    Each key in a map is unique.

    HashMap
    Hash Table:
        Hash value nikalne method hunxa.
        1. Linear Probing.
        2. Chaining (LinkedList) 45 -> "Hello" -> "World".
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "Alice");
        studentMap.put(103, "Bob");

        System.out.println(studentMap.get(103));

        System.out.println(studentMap.containsKey(102));

        studentMap.remove(103);
        System.out.println(studentMap);

        Set<Integer> keys = studentMap.keySet();
        System.out.println(keys);

        for(String name: studentMap.values()) {
            System.out.println(name);
        }
    }
}
