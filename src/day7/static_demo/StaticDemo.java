package day7.static_demo;

class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println("Object created. Current count: " + count);
    }

    public static void sayHello() {
        System.out.println("Hello from static method!");
    }
}

public class StaticDemo {

    // Static -> data (variables), methods (behaviors)
    // Without creating any object, we can use those members.

    // "static" keyword
    // Restrictions on static methods:
    /*
        1. They can only directly call other static methods of their class.
        2. They can only directly access static variables of their class.
        3. They can't infer to "this" or "super" in any way.
     */

    public static void main(String[] args) {
        // Demo 1: Static variable shared across all objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println(Counter.count);
        Counter.sayHello();
    }
}
