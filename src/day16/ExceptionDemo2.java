package day16;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scan.nextInt();
        System.out.println("Enter number");
        int b = scan.nextInt();
        try {
            int div = divide(a, b);
            System.out.println("Result of a / b is:" + div);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("No exception");
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}

// try-catch-finally: blocks
// throw and throws: statement
