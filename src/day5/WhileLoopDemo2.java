package day5;

import java.util.Scanner;

public class WhileLoopDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Enter name:");
            String name = scan.nextLine();
            if (name.equalsIgnoreCase("ashish")) {
                flag = false;
            }
        }
    }
}
