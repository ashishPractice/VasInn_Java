/*
Java program to print the number entered by the user only if the number entered is negative
 */

package assignment3;

import javax.swing.*;

public class Ques13 {
    public static void main(String[] args) {
        // User input
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter Negative Number:: "));

        // Repeatedly asking input if value is not negative
        while(num >= 0 ){
            num = Integer.parseInt(JOptionPane.showInputDialog("Invalid!! Again Enter Negative Number:: "));
        }

        // Displaying the negative value
        JOptionPane.showMessageDialog(null, "You Entered: " + num);
    }
}
