package day12;

@FunctionalInterface
interface Calculator1 {
    int calculate(int a, int b);
}

public class SecondFunctionalDemo {
    public static void main(String[] args) {
//        Calculator addition = new Calculator() {
//            @Override
//            public int calculate(int a, int b) {
//                return a + b;
//            }
//        };

        Calculator1 addition = (a, b) -> a + b;

        System.out.println(addition.calculate(10, 20));
    }
}
