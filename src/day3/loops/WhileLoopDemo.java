package day3.loops;

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {

        // When we don't know how many times we want to run our code.

        // Syntax:
        /*
            while(condition) {

            }
         */

        Scanner sc = new Scanner(System.in); // InputStream
        int num;

        while((num = sc.nextInt()) != 0) {
            System.out.println("Entered: " + num);
        }

    }
}
