/*
Java program to find the given number is even or odd
 */

package assignment;

import javax.swing.*;

public class Ques16 {
    public static void main(String[] args) {
        // User input
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter number:"));

        // Checking if number is odd or event
        if (num % 2 == 0) {
            JOptionPane.showMessageDialog(null, num + " is even");
        } else {
            JOptionPane.showMessageDialog(null, num + " is odd");
        }


    }
}
