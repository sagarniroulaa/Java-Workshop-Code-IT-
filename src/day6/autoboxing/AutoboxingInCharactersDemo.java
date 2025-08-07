package day6.autoboxing;

public class AutoboxingInCharactersDemo {

    public static void main(String[] args) {
        Character ch = 'A'; // autoboxing
        char letter = ch; // auto-unboxing

        if(ch == 'A') {
            System.out.println("It's an A.");
        }
    }
}
