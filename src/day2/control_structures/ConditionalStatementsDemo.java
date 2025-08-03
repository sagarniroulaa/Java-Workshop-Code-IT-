package day2.control_structures;

public class ConditionalStatementsDemo {
    // 1. Conditional Statements
    // 2. Switch Statements
    // 3. Jump Statements

    public static void main(String[] args) {
        // a. if statement
        int x = 0;
//        if(x > 0) {
//            System.out.println("Positive ho!");
//        }

        // b. if-else statement
//        if(x > 0) {
//            System.out.println("Positive!");
//        } else {
//            System.out.println("Not positive!");
//        }

        // c. if-else-if ladder
        if(x > 0) {
            System.out.println("Positive!");
        } else if(x < 0) {
            System.out.println("Negative!");
        } else {
            System.out.println("Zero!");
        }
    }
}
