package day5.access_modifiers;

public class AccessModifiersDemo {

    //  Classes, fields, constructors and methods

    // 1. public
    //  - Accessible from anywhere in the program (any package, any class).

    // 2. private
    // - Accessible only from class where it is defined.

    // 3. protected
    // - Accessible:
        // Within the same package
        // By classes (even if it is in different packages)

    // 4. Default (Package-private)
    // - Can't be accessed from outside the package.

    public static void main(String[] args) {
        Cars c = new Cars();
        System.out.println(c.getBrand());
    }
}
