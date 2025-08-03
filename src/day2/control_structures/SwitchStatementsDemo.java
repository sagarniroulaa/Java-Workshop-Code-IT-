package day2.control_structures;

import java.util.Scanner;

public class SwitchStatementsDemo {

    public static void main(String[] args) {

        // Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month's number: ");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                System.out.println("Invalid!");

        }

        // Jump Statements
        // a. break
        // b. continue -> skip the current iteration
        // c. return -> void: return;
        //                int: return 10;
    }
}
