/*
Java program to print the Fibonacci series
 */

package assignment;

import javax.swing.*;

public class Ques30 {
    public static void main(String[] args) {
        // User input
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter number of term::"));

        // variable declaration and initialization
        int a = 1;
        int b = 1;
        int c;

        // Setting first two number of series
        String msg = "The fibonacci Series upto "+ n +" terms are:\n 1, 1, ";

        // looping till n-2 term as first 2 number are already computed
        for (int i = 0; i < n -2; i++) {
            // computing fibonacci series
            c = a+b;
            msg = msg + c + ", ";
            a = b;
            b = c;
        }

        // Displaying result
        JOptionPane.showMessageDialog(null, msg);


    }
}
