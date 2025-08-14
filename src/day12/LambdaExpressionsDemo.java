package day12;

/*
    Syntax:
        (parameters...) -> expression
        (parameters...) -> { statements; }

        E.g.
        () -> System.out.println("Hello"); // No parameter
        x -> x * x; // One parameter
        (a, b) -> a + b; // Multiple parameters

    If something is to be returned from Lambda expression:
    1. Implicit Return
    2. Explicit Return
 */

@FunctionalInterface
interface Square {
    int calculate(int x);
}

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class LambdaExpressionsDemo {
    public static void main(String[] args) {
        Square sq = (x) -> x * x;
        System.out.println(sq.calculate(3));

        Calculator calc = (a,b) -> {
            int sum = a + b;
            System.out.println("Sum: " + sum);
            return sum;
        };

        System.out.println(calc.calculate(3, 4));
    }
}
