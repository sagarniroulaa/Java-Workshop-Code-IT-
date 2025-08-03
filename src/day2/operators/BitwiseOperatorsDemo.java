package day2.operators;

public class BitwiseOperatorsDemo {
    public static void main(String[] args) {

        // 00000010 => 2
        int x = 2;
        System.out.println(~x);

        int y = 0b11111011;
        byte z = (byte) y;
        System.out.println(z);

        // MSB
        // byte -> 1B (8 bits)
        // 01111111 -> 127 (Postive maximum for byte)

        // 1's complement -> Invert all bits
        // 2's complement -> Invert all bits and add 1

        // +5 -> 00000101
        // ~5 -> 11111010 + 1 -> 11111011 -> -5 in 2's complement.

        // 00101010 00001111 -> 00001010
        // 00101010 00001111 -> 00101111
        // 00101010 00001111 -> 00100101

        int a = 12;
        int b = 10;

        System.out.println("~a = " + (~a) + " " + Integer.toBinaryString(~a));
        System.out.println("a & b = " + (a & b) + " " + Integer.toBinaryString(a & b));
        System.out.println("a | b = " + (a | b) + " " + Integer.toBinaryString(a | b));
        System.out.println("a ^ b = " + (a ^ b) + " " + Integer.toBinaryString(a ^ b));

        // Left Shift (<<), Right Shift (>>)
        // value << num;  // value >> num;

        int c = 64; // 01000000 -> 00000000 00000000 00000001 00000000;
        c = c << 2;
        byte toByte = (byte) (c<<2);
        System.out.println(toByte); // gives 0 because byte
        System.out.println(c); // gives 256 because int

        // Right Shift (>>) 00000000 00000000 00000000 00100011
        int d = 35; // 00100011 -> 00001000
        d = d >> 2;
        System.out.println(d);

        // Left shift -> Changes MSB
        // Right shift -> Doesn't change MSB bit (replaces by 1)
    }
}
