package day11.generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundDemo {
    public static void main(String[] args) {

        List<? super Integer> list = new ArrayList<Number>();
        List<? super Integer> list2 = new ArrayList<Object>();
        List<? super Integer> list3 = new ArrayList<Integer>();
       // List<? super Integer> list4 = new ArrayList<Double>(); // this is not possible
    }
}
