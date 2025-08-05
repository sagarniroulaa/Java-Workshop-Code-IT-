package day4.strings;

public class StringsCommonMethodsDemo {
    public static void main(String[] args) {

        // .length() ->
        // .charAt(index) ->
        // .substring(startIndex, endIndex) // endIndex is exclusive
        // .indexOf(char/String) // if not found, -1
        // .toLowerCase() / .toUpperCase()
        // .trim() // removes leading and trailing spaces
        // .toCharArray() // char[]

        String name = "Rajesh";
        System.out.println(name.length());

        System.out.println(name.charAt(2));

        System.out.println(name.substring(4, 6));

        System.out.println(name.indexOf("esh"));

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String withSpaces = "     Java Program        ";
        System.out.println(withSpaces.trim());

        char[] nameChars = name.toCharArray();
        for(char c: nameChars) {
            System.out.print(c + " ");
        }
    }
}
