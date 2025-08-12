package day10;

/*
    Exception Chaining:
        Mechanism where one exception (the cause) is wrapped inside
        another exception (the wrapper or high-level exception)
        to provide additional context.

        Throwable getCause();
        Throwable initCause(Throwable causeExc);

    Why use them?
    -> Maintain Root Cause Information.
 */

public class ChainedExceptions {
    static void demoproc() {
        NullPointerException e = new NullPointerException("top layer");
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }
        catch(NullPointerException e) {
            System.out.println("Caught: " + e);
            System.out.println("Original cause: " + e.getCause());
        }
    }
}
