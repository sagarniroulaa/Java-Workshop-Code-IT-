package day1;

public class VariablesDemo {
    public static void main(String[] args) {

        // Syntax: type var_name
        int a = 5;
        byte x = 64;

        long longNum = 4654815648949l;
        float floatNum = 3.15f;

        char myChar = 'A'; // 65
        // 'A', "A"
        // Character arithmetic
        myChar++;
        System.out.println(myChar);
        boolean isRaining = true;
        int p =5;
        if(!isRaining) {
//            int p =10;
            System.out.println("It is raining");
        }

        float m = 50.00541f;
        int n = (int) m;

//        int p = 10;
        float q = p;
        System.out.println(q);
    }


    /*
    1. Integer (signed) -> byte(1B), short(2), int(4), long(8)
    2. Float -> double(64bits), float(32bits)
    3. Character -> (16bits)
    4. Boolean -> true/false

    Java Literals

    int a = 1;
    int y = 0x1F;
    int z = 0b1010;

    float pi = 3.14f;
    double gravity = 9.8;

    char grade = 'A';

    boolean isRaining = false;
     */
}
