package day4.string_builder;

public class ComparisonBStringAndStringBuilder {
    public static void main(String[] args) {

        // Time Complexity of String = O(n)
        // Time Complexity of StringBuilder = O(1)

        long start = System.currentTimeMillis();
        String str = "";
        for(int i=0;i<5000;i++) {
            str += i;
        }

        long end = System.currentTimeMillis();
        System.out.println("String time: " + (end - start));

        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<5000;i++) {
            sb.append(i);
        }

        end = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (end - start));
    }
}
