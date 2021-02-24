package day5;

public class IfElseDemo {

    public static void main(String[] args) {
        int a = 14;
        int b = 10;


        /*if demo*/
        System.out.println("If Demo");
        if (a > b) {
            System.out.println("A is greater than B");
        }
        if (b > a) {
            System.out.println("B is greater than A");
        }

        /*if-else demo*/
        System.out.println("\n\nIf else Demo");
        if (a > b)
            System.out.println("A is greater than B");
        else
            System.out.println("B is greater than A");

        /*nested if else*/
        System.out.println("\n\nNested if-else demo");
        int c = 20;
        if (a > b) {
            if (a > c)
                System.out.printf("A is greater than B and c");
            else
                System.out.println("C is greater than A and B");
        } else {
            if (b > c)
                System.out.printf("B is greater than A and c");
            else
                System.out.println("C is greater than A and B");
        }

        /*Else-if demo*/
        System.out.println("\nElse-if demo");
        int marks = 89;
        if (marks>=80)
            System.out.printf("Distinction");
        else if (marks>=60)
            System.out.println("First Division");
        else if (marks>= 45)
            System.out.println("Second Division");
        else if (marks>=32)
            System.out.println("Third Division");
        else
            System.out.println("Failed");

    }
}
