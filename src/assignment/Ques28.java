/*
Java Program to calculate prime number
 */

package assignment;

import javax.swing.*;

public class Ques28 {

    // Function that check whether a given number is prime or not
    static String isPrimeNumber(int n) {
        // variable declaration and initialization
        boolean flag = false;
        String msg = "";

        // looping from second term till square root of number
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // checking if number it is divisible or not
            if (n % i == 0) {
                flag = true;
                break;
            }
        }

        //checking for prime or not
        if (flag)
            msg = n + " is not a Prime number";
        else
            msg = n + " is a Prime number";

        return msg;
    }

    // function to check first n prime number
    static String firstNthPrime(int n) {
        // variable declaration and initialization
        boolean flag = false;
        String msg = "\nThe first nth Prime number::\n";
        int num = 2;
        int count = 0;

        // looping till n term
        while (count < n) {

            // looping from second term till square root of number
            for (int j = 2; j <= Math.sqrt(num); j++) {

                // checking if number it is divisible or not
                if (num % j == 0) {
                    flag = true;
                    break;
                }
            } // end of for loop

            //checking for prime or not if yes appending to string
            if (flag) {

            } else {
                msg = msg + num + ", ";
                count++;
            }
            flag = false; // reseting the value to false
            num++; // incrementing the number
        } // end of while loop
        return msg;
    }

    // function to find prime number between two term.
    static String allPrimeNumber(int start, int end) {

        // variable declaration and initialization
        String msg = "\nThe prime number between " + start + " and " + end + " are:\n";
        boolean flag = false;

        // looping from start till end term
        for (int i = start; i <= end; i++) {
            // looping from second term till square root of number
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            } // end of inner for loop

            //checking for prime or not if yes appending to string
            if (flag) {

            } else {
                msg = msg + i + ", ";
            }
            flag = false; // reseting the value to false
        } // end of loop
        return msg;

    }

    // main function
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter number"));
        String msg1 = isPrimeNumber(num); // function call
        int term = Integer.parseInt(JOptionPane.showInputDialog("Enter number of term"));
        String msg2 = firstNthPrime(term); // function call
        int start = Integer.parseInt(JOptionPane.showInputDialog("Enter starting term"));
        int end = Integer.parseInt(JOptionPane.showInputDialog("Enter ending term"));
        String msg3 = allPrimeNumber(start,end); // function call

        // Displaying the result
        JOptionPane.showMessageDialog(null, msg1+msg2+msg3);
    }
}
