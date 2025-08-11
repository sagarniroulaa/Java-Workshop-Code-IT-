package day9.anonymous_classes;

/*
    Anonymous class -> Special kinds of inner classes without a name.
    -> They enable us to define and instantiate a class at the same time, for one-time use.
    -> Used to provide quick implementation of an interface.
 */

interface Greeting {
    void sayHello();
}

public class AnonymousClassesDemo {
    public static void main(String[] args) {
        Greeting greet = new Greeting() {  // Anonymous Classes
            @Override
            public void sayHello(){
                System.out.println("Hello from Anonymous Class!");
            }
        };

        greet.sayHello();
    }
}
