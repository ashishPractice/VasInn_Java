/*
Array: is a group of element of same datatype arranged in a sequential order

 */

package day10;


public class ArrayDemo2 {
    public static void main(String[] args) {
        // datatype[] arrayName = new datatype[size of array]

        int[] arr = new int[3];
        System.out.println(arr);
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);


    }
}
