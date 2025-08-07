package day6.enumerations;

enum Level {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private int code; // uses "final" in real-world scenario

    Level(int code) {
        // If we want constants to carry some data, we need a constructor.
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

public class EnumsAsClassTypeDemo {

    // Enums -> They are not just a list of constants.
    // Under the hood, they are special types of classes.
    /*
        -> Add fields, constructors and methods.
        -> Each constant is like an object (an instance of the enum class).
        -> Enums are implicitly final and extend java.lang.Enum
     */

    public static void main(String[] args) {

        Level current = Level.MEDIUM;

        System.out.println("Current level: " + current);
        System.out.println("Level code: " + current.getCode());

        current.setCode(99);
        System.out.println("Updated code: " + current.getCode());
    }
}
