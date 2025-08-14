package day12.stream_api;

/*
    Mapping, filtering, reducing
 */

import java.util.Arrays;
import java.util.List;

public class StreamsDemo {
    // Filtering
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Shyam", "Hari", "Krishna");

        names.stream()
                .filter(name -> name.startsWith("S"))
                .forEach(name -> System.out.println(name));

        students.stream()
                .map(s -> s.getMarks())
                .forEach(i -> System.out.println(i));
    }
}
