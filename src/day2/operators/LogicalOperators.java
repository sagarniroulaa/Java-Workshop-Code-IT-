package day2.operators;

public class LogicalOperators {
    public static void main(String[] args) {

        // A & B ->
        // A | B ->
        // !A ->
        // A ^ B ->
        // A && B ->

        boolean a = true;
        boolean b = false;

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(!a);
        System.out.println(a && b);
        System.out.println(a || b);

        boolean c = true;
        c &= b; // c = c & b;
        c |= b;
        c ^= b;
        System.out.println(a == c);
        System.out.println(a != c);
        String result = ( a && !b ? "Condition is true" : "Condition is false");
    }
}
