/*
Java program to print the table of given numbers.
 */

package assignment;

import javax.swing.*;

public class Ques22 {
    public static void main(String[] args) {
        // User input
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter number:"));
        String table = "";

        // looping 10 times to calculate the table of given number
        for (int i = 1; i <= 10; i++) {
            table = table + num + " * " + i + " = " + (num * i) + "\n";
        }

        // Displaying the result
        JOptionPane.showMessageDialog(null, table);
    }
}
