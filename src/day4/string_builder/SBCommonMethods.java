package day4.string_builder;

public class SBCommonMethods {
    // .append(str)
    // .insert(index, str)
    // .replace(start, end, str)
    // .delete(start, end)
    // .reverse()
    // .toString()

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("HelloWorld");
        sb.insert(5, " ");
        System.out.println(sb.toString());

        sb.replace(6, 11, "Nepal");
        System.out.println(sb.toString());

        StringBuilder sb2 = new StringBuilder("Hello Everyone");
        sb2.delete(0, 6);
        System.out.println(sb2.toString());

        sb2.reverse();
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("Data");
        String result = sb3.toString();
        System.out.println(result);
    }
}
