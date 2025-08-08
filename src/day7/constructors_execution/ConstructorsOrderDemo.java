package day7.constructors_execution;

/*
    B extends A
    C extends B

    // A, B, C: all these classes have their own constructors.
                in what order are they executed?

 */

class A {
    A() {
        System.out.println("Inside A's constructor.");
    }
}

class B extends A {
    B() {
        System.out.println("Inside B's constructor.");
    }
}

class C extends B {
    C() {
        System.out.println("Inside C's constructor.");
    }
}

public class ConstructorsOrderDemo {
    public static void main(String[] args) {
        C obj = new C();
    }
}
