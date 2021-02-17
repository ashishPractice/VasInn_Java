package day4;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter byte value::");
        byte b = scan.nextByte();
        System.out.println(b);

        System.out.println("Enter short value::");
        short s =  scan.nextShort();
        System.out.println(s);

        System.out.println("Enter int value::");
        int i = scan.nextInt();
        System.out.println(i);

        System.out.println("Enter long value::");
        long l = scan.nextLong();
        System.out.println(l);

        System.out.println("Enter float value::");
        float f =  scan.nextFloat();
        System.out.println(f);

        System.out.println("Enter double value::");
        double d = scan.nextDouble();
        System.out.println(d);

        System.out.println("Enter boolean value::");
        boolean bo = scan.nextBoolean();
        System.out.println(bo);

        System.out.println("Enter a word");
        String s1 = scan.next();
        System.out.println(s1);

        System.out.println("Enter a line");
        String s2 = scan.nextLine();
        System.out.println(s2);

        System.out.println("Enter a character");
        char c = scan.next().charAt(0);
        System.out.println(c);

    }
}
