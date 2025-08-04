package day3.loop_control_statements;

public class ContinueDemo {
    public static void main(String[] args) {
        // continue -> skips the current iteration

        for(int i=1;i<=10;i++) {
            if(i==5)
                continue;
            System.out.println(i);
        }
    }
}
