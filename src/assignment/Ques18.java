/*
Java program to display the largest number from given three values
 */
package assignment;

import javax.swing.*;

public class Ques18 {
    public static void main(String[] args) {
        // User input
        int a = Integer.parseInt(JOptionPane.showInputDialog("Number 1"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Number 2"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Number 3"));

        // Use of ternary operator to find max number
        int max = a > b ? (a > c ? a : c) : (b > c ? b : c);

        // Dispalying result
        JOptionPane.showMessageDialog(null,max + " is the largest among "
                + a +" , "+ b + " , and "+ c );
    }
}
