package day3.loops;

public class ForLoopDemo {
    public static void main(String[] args) {

        // For loop -> Used when we know how many times
        // we want to repeat something.
        // Syntax:
//        for(initialization; condition; update) {
//
//        }

        for(int i=0;i<10;i++) {
            System.out.println(i+1);
        }

        int sum = 0;
        for (int i=1;i<=10;i++) {
            sum += i;
            // sum = 0 + 1; => 1
            // sum = 1 + 2; => 3
        }
        System.out.println(sum);
    }
}
