package day6.autoboxing;

public class AutoboxingInMethodsDemo {
    public static int square(Integer num) {
        return num * num;
    }

    public static void main(String[] args) {

        int input = 5;
        Integer result = square(input); // has to return "int"

        System.out.println("Square result: " + result);
    }
}
