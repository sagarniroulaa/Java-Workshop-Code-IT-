package day3.loop_control_statements;

public class ReturnDemo {
    public static void main(String[] args) {

        int a = 5;
        checkNumber(a);
    }

    public static void checkNumber(int num) {
        if(num < 0) {
            System.out.println("Negative number");
            return;
        }
        System.out.println("Positive Number");
    }
}
