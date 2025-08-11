package day9.interfaces;

/*
    Interface -> Contract or blueprint of methods
                that a class must follow.

              -> What should be done, not how it's done.

              -> Rule: A class implementing an interface must provide method
                       implementations for all interface's methods.

    -> Declared using "interface" keyword.
    -> Methods => public abstract by default.
        E.g., int value();

    -> Variables => public static final by default.

    -> Before Java 8: public abstract methods only allowed.
    -> After Java 8: Can have default and static methods as well.
    -> After Java 9: Can have private methods.

    Why use interface?
    -> Multiple inheritance is possible.
    -> Polymorphism is possible (objects can be referred by their interface type).
 */
public interface InterfaceDemo {
}
