package day7.static_demo;

class StaticVsNonStatic {
    static int staticVar = 10;
    int nonStaticVar = 5;

    static void staticMethod() {
        System.out.println("Static method");
        System.out.println("Accessing staticVar: " + staticVar);
        // System.out.println(nonStaticVar); // Compile-time error
    }

    void nonStaticMethod() {
        System.out.println("Non-static method");
        System.out.println("Accessing staticVar: " + staticVar);
        System.out.println(nonStaticVar);
    }
}

public class StaticVsNonStaticDemo {
    public static void main(String[] args) {
        StaticVsNonStatic.staticMethod();

        StaticVsNonStatic obj = new StaticVsNonStatic();
        obj.nonStaticMethod();
    }
}
