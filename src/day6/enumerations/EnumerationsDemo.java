package day6.enumerations;

enum TrafficLight {
    RED, YELLOW, GREEN;  // Enumeration constants
    // Each constant is declared as public, static, final
}

public class EnumerationsDemo {

    /*
        Enumerations -> List of named constants
        Enumerations always define a class type.
        (So we can declare reference variables)

        E.g. TrafficLight -> RED, YELLOW, GREEN

        TrafficLight tl = TrafficLight.GREEN;
        OperationStatus -> SUCCESS, FAILED, PENDING
     */

    public static void main(String[] args) {
        TrafficLight tl = TrafficLight.YELLOW;

        // Compare two numeration constants for equality.
        if(tl == TrafficLight.YELLOW) {
            System.out.println("Light is yellow!");
        }

        // Control a switch statement
        switch(tl) {
            case RED:
                System.out.println("Light is red!");
            case YELLOW:
                System.out.println("Light is yellow!");
            case GREEN:
                System.out.println("Light is green!");
        }
    }
}
