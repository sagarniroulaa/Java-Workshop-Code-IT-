package day5;

class Student {
    String name;

    Student(String name) {
        this.name = name;
        // Without this, name refers to the parameter, not the field.
    }

    void display() {
        System.out.println("Student name: " + name);
    }
}

public class ThisKeywordDemo {
    // this keyword refers to the current object that invoked a method

    // Why it is needed?
    /*
        - To distinguish between instance variables and local variables.
        - To call another constructor from within a constructor (constructor chaining).
        - To pass the current object as an argument.
     */

    // Use cases: 1. Resolving variable name conflicts
    //            2. Constructor Chaining (this())

    public static void main(String[] args) {
        Student s1 = new Student("Ram");
        s1.display();
    }
}
