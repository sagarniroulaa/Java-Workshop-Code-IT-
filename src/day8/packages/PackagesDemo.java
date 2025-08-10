package day8.packages;

/*
    Package
    -> Way of grouping related classes, interfaces, and sub-packages.
    -> Similar to folders.
    -> 1. Helps avoid name conflicts.
    -> 2. Organizes large project into manageable modules.
    -> 3. Control access to classes. (public, private, protected, default)

    Types of Packages:
    1. Built-in packages
        -> Provided by Java API.
        -> E.g., java.util -> Utility classes like ArrayList, HashMap.
                java.io -> Input/output of files.
                java.sql -> Classes for database access.
    2. User-defined packages
        -> Programmers create them to organize their own classes.
        -> E.g., day8.packages

     Subpackages:
      -> They organize code into hierarchical structure.

     Packages and Member Access:
     1. public -> Access to all packages and sub-packages.
     2. private ->
     3. protected -> Access to package where it is defined, also outside the package but
        this should be inherited.
     4. No modifier(package-private) -> Accessed in the same package.
        (Not in subpackages of that exact package).

     Benefits of Using Packages:
     1. Modularity
     2. Reusability
     3. Encapsulation
     4. Namespace Management -> Avoids naming collisions.
 */
public class PackagesDemo {
}
