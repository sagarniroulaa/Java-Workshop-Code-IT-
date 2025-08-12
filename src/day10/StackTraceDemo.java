package day10;

public class StackTraceDemo {
    static void methodA() {
        methodB();
    }

    static void methodB() {
        methodC();
    }

    static void methodC() {
        int x = 10/0; // Division by zero
    }

    public static void main(String[] args) {
        methodA();
    }
}
