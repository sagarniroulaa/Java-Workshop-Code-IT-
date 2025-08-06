package day5;

class Box {

}

public class AssigningObjectReferenceDemo {
    public static void main(String[] args) {

        Box b1 = new Box(); // null <- b1
        Box b2 = b1;

        b1 = null;
    }
}
