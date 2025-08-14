package day12;

/*
    Functional Interface -> Such interfaces that contains exactly one abstract method.
    It represents single behavior or functionality.

    Lambda expressions -> can be implemented in functional
            interfaces.

    Default methods and static methods, but must only have exactly one abstract
    method.


 */

@FunctionalInterface
interface MyInterface {
    void eat(); // public, abstract
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        // Anonymous Class
        MyInterface myInterface = new MyInterface() {
            @Override
            public void eat() {
                System.out.println("eating");
            }
        };

        /*
            Lambda expressions -> () -> {
                // code....
            };
         */

        MyInterface myInterface2 = () -> {
            System.out.println("eating");
        };
    }
}
