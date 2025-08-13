package day11.generics;

/*
    1. Upper bound
    -> <T extends Number> // Integer, Float, Double

    2. Lower bound
    -> <T super Integer> // Object -> Number -> Integer
    -> Doesn't accept Double.
 */

import java.util.Arrays;
import java.util.List;

/*
    public <T extends Number> void sum(T a, T b) {

    }
 */

public class BoundedTypeParametersDemo {
    public static double sumList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Number> ints = Arrays.asList(1, 2, 3);
        List<Number> doubles = Arrays.asList(2.5, 3.5, 4.5);

        System.out.println("Sum of ints: " + sumList(ints));
        System.out.println("Sum of doubles: " + sumList(doubles));
    }
}
