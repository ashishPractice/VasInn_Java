/*
Java program to accept the roll, name, and nationality of the person and display those values in good format.
 */

package assignment3;

import javax.swing.*;

public class Ques12 {
    public static void main(String[] args) {
        // User input
        String roll = JOptionPane.showInputDialog("Roll");
        String name = JOptionPane.showInputDialog("Name");
        String nationality = JOptionPane.showInputDialog("Nationality");

        // Formatting the string
        String result = "Details of Person"+
                "\n Roll: "+ roll+
                "\n Name: "+ name+
                "\n Nationality: "+ nationality;

        // Displaying the result
        JOptionPane.showMessageDialog(null, result);

    }
}
