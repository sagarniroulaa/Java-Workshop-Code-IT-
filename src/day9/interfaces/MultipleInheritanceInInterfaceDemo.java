package day9.interfaces;

interface A {
    void m1();
}

interface B {
    void m2();
}

// In classes, this can't be done!
interface C extends A, B {
    void m3();
}

public class MultipleInheritanceInInterfaceDemo {
}
