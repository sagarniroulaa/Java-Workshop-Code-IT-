package day3.loops;

import java.util.Scanner;

public class DoWhileLoopDemo {
    public static void main(String[] args) {

        // Executes at least once.
        // Syntax:
        /*
            do {
                // code block
            } while(condition);
         */

        Scanner sc = new Scanner(System.in);

        int input;
        do {
            System.out.println("Enter a number (0 to stop): ");
            input = sc.nextInt();
        } while(input != 0);
    }
}
