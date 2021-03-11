package day16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scan.nextInt();
        System.out.println("Enter number");
        int b = scan.nextInt();
        try {
            int div = divide(a, b);
            System.out.println("Result of a / b is:" + div);
        } catch (ArithmeticException | InputMismatchException e) {
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
