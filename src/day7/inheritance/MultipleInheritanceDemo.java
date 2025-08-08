package day7.inheritance;

class A {
    void show() {
        System.out.println("Hello from A");
    }
}

class B {
    void show() {
        System.out.println("Hello from B");
    }
}

// This will cause compile-time error.
//class C extends A, B { // This is solved by Interfaces.
//}

public class MultipleInheritanceDemo {
}
