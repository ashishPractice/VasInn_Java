package day5;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your choice<1to4>:");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("This is addition");
                break;

            case 2:
                System.out.println("This is substraction");
                break;
            case 3:
                System.out.println("This is multiplication");
                break;
            case 4:
                System.out.println("This is division");
                break;

            default:
                System.out.println("Invalid choice");

        }

    }
}
