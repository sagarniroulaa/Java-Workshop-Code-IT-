package day9.anonymous_classes;

abstract class Animal {
    abstract void sound();
}

public class AnonymousClassesInAbstractClassDemo {
    public static void main(String[] args) {

        Animal dog = new Animal() {
            @Override
            void sound() {
                System.out.println("Dog makes a sound!");
            }
        };

        dog.sound();
    }
}
