package day2.operators;

public class ArithmeticOperatorsDemo {
    // Operator Precedence
    /*    1 is the highest priority and in case of operators at the same level,
    priority is given from left to right.
        1 ()
        2 ++,--,+,-,~,!
        3 *,/,%
        4 +,-
        5 <<,>>,>>>
        6 <, <=, >, >=, instanceof
        7 ==, !=
        8 &
        9 ^
        10 &&
        11 ?:
        12 =, +=, -=, *=, /=, %=

     */

    public static void main(String[] args) {

        double a = 10;
        int b = 3;

        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        double x = 5.55;
        x--; // x = x + 1; // 1.0
        System.out.println("After x-- = " + x);

        int y = 42;
        int z = ++y; // y = y+1 , z = y

        char myChar = 'B';
        myChar--;
        System.out.println(myChar);

        int c = 4;
        c += 2; // c = c + 2;
        c -= 1; // c = c - 1;
        c *= 3; // c = c * 3;
        c /= 2; // c = c / 2;
        c %= 3; // c = c % 3;
    }
}

