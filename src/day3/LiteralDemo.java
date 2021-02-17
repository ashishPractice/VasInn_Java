package day3;

public class LiteralDemo {
    public static void main(String[] args) {
        // Literal: fixed value-datatypes

        // 1. Integer Literal 43543 67657 335
        // By default java integer literal are int
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l1 = 2147483627;
        long l2 = 2147483648L;
        long l3 = 9223372036854775807L;

        // 2. Floating point Literal
        // By default floating point literal are fouble
        float f  = 45.76f;
        double d = 45.76;


        // 3. Boolean Literal
        boolean b1 = true;
        boolean b2 = false;

        // 4. Character literal 'a', '1', '*'
        // Everything that is in single code is literal
        // Only one character are allowed
        char c1 = 'a';
        char c2 = '1';
        char c3 = '*';
        char c4 = '\u0001'; // unicode

        // 5. String literal "Hello", "Java"
        // Everything that is written inside double code
        String s1 = "ram";
        String s2 = "aba@123#T5";
        String s3 = "";
        String s4 = " ";
        String s5 = "123";
        String s6 = "34.45";
        String s7 = "true";
        String s8 = "Hello, My name is Khan";
        String s9 = "2021-02-15";


        // 6. Null Literal
        String s10 = null;

        LiteralDemo obj = new LiteralDemo(); // Defining object in java

        LiteralDemo obj2 = null;

    }
}
