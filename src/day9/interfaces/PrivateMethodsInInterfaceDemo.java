package day9.interfaces;

// Private methods -> Helper methods

interface Greeting {
    default void sayHello(String name) {
        System.out.println(getGreeting(name));
    }

    // Java 9 -> Private method
    private String getGreeting(String name) {
        return "Hello, " + name + "!";
    }
}

class MyGreeting implements Greeting {}

public class PrivateMethodsInInterfaceDemo {
    public static void main(String[] args) {
        MyGreeting g = new MyGreeting();
        g.sayHello("Michael");
    }
}
