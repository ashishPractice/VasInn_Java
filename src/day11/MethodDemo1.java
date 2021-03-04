package day11;

import java.util.*;

public class MethodDemo1 {

    public int[] returnArray(Scanner scan) {
        System.out.printf("Enter size of array");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element::");
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public void printElemetofAnArray(int[] arr) {
        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        MethodDemo1 obj = new MethodDemo1();

        int[] arr = obj.returnArray(scan);

        obj.printElemetofAnArray(arr);


    }

}
