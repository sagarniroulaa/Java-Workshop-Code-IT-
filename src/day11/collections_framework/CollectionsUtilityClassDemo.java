package day11.collections_framework;

import java.util.*;

/*
    Contains many static methods Collections."__"
    sort(List<T> list)
    reverse(List<?> list)
 */
public class CollectionsUtilityClassDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("C", "A", "B", "A", "B"));
        Collections.sort(fruits);
        System.out.println(fruits);

        List<Integer> nums = Arrays.asList(10, 20, 5, 30);
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        System.out.println(max + " " + min);

        Collections.reverse(nums);
        System.out.println(nums);

        int frequencyA = Collections.frequency(fruits, "A");
        System.out.println(frequencyA);
    }
}
