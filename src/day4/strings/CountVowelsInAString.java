package day4.strings;

public class CountVowelsInAString {

    public static void main(String[] args) {
        String originalInput = "Education";
        String input = originalInput.toLowerCase();
        int count = 0;

        for(int i=0;i<input.length();i++) {
            char ch = input.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("No. of vowels: " + count);
    }
}
