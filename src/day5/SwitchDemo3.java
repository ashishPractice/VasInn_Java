package day5;

import java.util.Scanner;

public class SwitchDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your choice<add,sub,mul,div>:");
        String choice = scan.next();

        switch (choice) {
            case "add":
                System.out.println("This is addition");
                break;

            case "sub":
                System.out.println("This is substraction");
                break;
            case "mul":
                System.out.println("This is multiplication");
                break;
            case "div":
                System.out.println("This is division");
                break;

            default:
                System.out.println("Invalid choice");

        }

    }
}
