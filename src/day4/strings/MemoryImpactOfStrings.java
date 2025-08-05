package day4.strings;

public class MemoryImpactOfStrings {

    public static void main(String[] args) {

        // Concatenation: 1. Runtime -> Heap memory
        // E.g.
        String myStr = "Hello"; // stored in SCP
        String newStr = myStr + " World"; // stored in heap memory

        // 2. Compile -> SCP
        String s = "";
        for(int i=0;i<100;i++) {
            s += i;
        }
    }
}
