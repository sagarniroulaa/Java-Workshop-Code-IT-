package day7.super_demo;

class Parent {
    int num = 100;

    void showMessage() {
        System.out.println("Message from parent");
    }
}

class Child extends Parent {
    int num = 200;

    void display() {
        System.out.println("Child num: " + num);
        System.out.println("Parent num: " + super.num);
        super.showMessage();
    }
}

public class AccessSuperClassMembersDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
