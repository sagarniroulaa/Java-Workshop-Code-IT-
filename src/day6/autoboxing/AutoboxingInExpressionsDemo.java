package day6.autoboxing;

public class AutoboxingInExpressionsDemo {
    public static void main(String[] args) {

        Integer a = 10; // autoboxing
        Integer b = 20;

        int sum = a + b; // auto-unboxing to int

        if(a < b) { // auto-unboxing
            System.out.println("a is less than b");
        }

        // autoboxing in compound assignment
        Integer c = 5;
        c += 10; // unbox to int, add, then autoboxed back to Integer

        Integer intVal = 15;
        Double doubleVal = 10.5;

        double result = intVal + doubleVal; // auto-unboxing happens during addition
    }
}
