package day16;

import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        //  Arithmetic Expection
        int a = 4;
        int b = 0;
        int r = a / b;
        System.out.println(r);

        // NullPointer Exception
        String s1 = null;
        s1.toCharArray();

        // NumberFormat Exception
        String s2 = "123a";
        int i = Integer.parseInt(s2);
        System.out.println(i);

        // InputMismatchException
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int n = scan.nextInt();
        System.out.println(n);

        // ArrayIndexOutOfBounds Exception
        int[] arr = new int[2];
        arr[2] = 10;

    }
}
