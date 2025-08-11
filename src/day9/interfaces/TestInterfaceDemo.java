package day9.interfaces;

interface Animal1 {
    void sound(); // public, abstract method
}

interface Test {
    void test();
}

class Dog1 implements Animal1, Test {
    @Override
    public void sound() {
        System.out.println("Bark!");
    }

    @Override
    public void test() {

    }
}

public class TestInterfaceDemo {
    public static void main(String[] args) {
        Animal1 myDog = new Dog1();
        myDog.sound();
    }
}
