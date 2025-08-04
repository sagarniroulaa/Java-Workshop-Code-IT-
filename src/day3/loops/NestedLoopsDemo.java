package day3.loops;

public class NestedLoopsDemo {
    /*
    Syntax:
    for(int i=1;i<=rows;i++) {
        for(int j=1;j<cols;j++) {
        }
    }
     */
    /*
        *
        * *
        * * *
        * * * *
     */
    public static void main(String[] args) {

        for(int i = 1; i<=4; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
