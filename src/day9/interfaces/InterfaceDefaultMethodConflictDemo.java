package day9.interfaces;

/*
    Java forces overriding of the conflicting default methods to avoid ambiguity.

    InterfaceName.super.method() -> calling default methods of the interface "InterfaceName".
 */

interface X {
    default void show() {
        System.out.println("Interface X");
    }
}

interface Y {
    default void show() {
        System.out.println("Interface B");
    }
}

class Z implements X, Y {
    public void show() {
        X.super.show();
        Y.super.show();
        System.out.println("Class C's own implementation.");
    }
}

public class InterfaceDefaultMethodConflictDemo {
    public static void main(String[] args) {
        Z obj = new Z();
        obj.show();
    }
}
