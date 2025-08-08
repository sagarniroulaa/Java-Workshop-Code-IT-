package day7.inheritance;

class Animal1 {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Barking...");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Dog1 myDog = new Dog1();

        Animal1 myAnimal = new Dog1();
//        myAnimal.bark();
    }
}
