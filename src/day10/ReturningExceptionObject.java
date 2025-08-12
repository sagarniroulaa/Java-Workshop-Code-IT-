package day10;

public class ReturningExceptionObject {
    static Exception calculate() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            return e;
        }

        return new RuntimeException("test");
    }

    public static void main(String[] args) {
        Exception obj = calculate();
        System.out.println(obj);
    }
}
