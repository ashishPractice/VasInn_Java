/*
Java program to find the second largest number in a given array using function
 */

package assignment;

import javax.swing.*;
import java.util.Arrays;

public class Ques35 {

    // function to compute second largest number using Array.sort
    static void secondLargest1 ( int[] num){
        String msg = "";
        Arrays.sort(num); // java predefined method sort

        // Displaying the result
        for (int i : num) {
            msg = msg + i + ", ";
        }
        msg = msg + "\n\nThe second largest number is: " + num[num.length - 2];
        JOptionPane.showMessageDialog(null, msg);
    }

    // function to compute second largest number using hard code method
    static void secondLargest2(int[] num){
        // variable declaration
        int first, second;
        String msg = "";

        // checking largest amount 2 number
        if (num[0] > num[1]) {
            first = num[0];
            second = num[1];
        } else {
            first = num[1];
            second = num[0];
        }

        // iterating through array
        for (int i = 2; i < num.length; i++) {
            if (num[i] > first) { // condition to check largest number
                second = first;
                first = num[i];
            } else if (num[i] > second) { // condition to check second largest number
                second = num[i];
            }
        }

        // Displaying the result
        for (int i : num) {
            msg = msg + i + ", ";
        }
        msg = msg + "\n\nThe second largest number is: " + second;
        JOptionPane.showMessageDialog(null, msg);
    }

    // main method
    public static void main(String[] args) {
        int[] num; // array declarartion

        String msg = "";

        // user input
        int term = Integer.parseInt(JOptionPane.showInputDialog("Enter number of term"));

        // checking if there is less than 2 elemnet in an array
        while (term < 2) {
            term = Integer.parseInt(JOptionPane.showInputDialog("Invalid Term. Again Enter number of term"));
        }

        //  instantiation of array
        num = new int[term];

        // n user input
        for (int i = 0; i < term; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter " + (i + 1) + " number"));
        }

        // Using java function sort
   //   secondLargest1(num);

        // Using hard code method
        secondLargest2(num);


    }
}
