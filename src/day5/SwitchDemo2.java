package day5;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your choice<+,-,*,/>:");
        char choice = scan.next().charAt(0);

        switch (choice) {
            case '+':
                System.out.println("This is addition");
                break;

            case '-':
                System.out.println("This is substraction");
                break;
            case '*':
                System.out.println("This is multiplication");
                break;
            case '/':
                System.out.println("This is division");
                break;

            default:
                System.out.println("Invalid choice");

        }

    }
}
