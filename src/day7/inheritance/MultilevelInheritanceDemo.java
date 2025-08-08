package day7.inheritance;

class Animal2 {
    void eat() {
        System.out.println("eat");
    }
}
// C->B, B->A
class Dog2 extends Animal2{
    void bark() {
        System.out.println("Bark");
    }
}

class Puppy extends Dog2 {
    void weep() {
        System.out.println("Weep");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.weep();
        p.bark();
        p.eat();
    }
}
