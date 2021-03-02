/*
Array: is a group of element of same datatype arranged in a sequential order

 */

package day10;


import java.util.Scanner;

public class ArrayDemo3 {
    public static void main(String[] args) {
        // datatype[] arrayName = new datatype[size of array]

        int[] arr = new int[3];

        Scanner scan = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter " + (i + 1) + " element:");
            arr[i] = scan.nextInt();
            sum= sum + arr[i];
        }

        System.out.println("Element in array are:");
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Sum of element is:: "+ sum);



    }
}
