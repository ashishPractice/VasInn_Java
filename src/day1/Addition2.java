/*Java program to add two number asking user input*/

package day1;

import java.util.Scanner;

public class Addition2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a::");
        int a = scan.nextInt();

        System.out.println("Enter b::");
        int b = scan.nextInt();

        int sum = a + b;

        System.out.println(sum);
        System.out.println("The sum of two number is::" + sum);
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }
}
