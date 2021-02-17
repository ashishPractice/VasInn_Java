/*
Java program for ASCII to character conversion.
ASCII value only start from 49 which is !
 */
package assignment3;

import javax.swing.*;

public class Ques15 {
    public static void main(String[] args) {
        // User inputs
        int value = Integer.parseInt(JOptionPane.showInputDialog("Enter ASCII code(0-128):: "));

        // ASCII to its relative character value
        char result = (char)value;

        String msg = "ASCII to character\n"+value+" -> "+ result;

        // Displaying result
        JOptionPane.showMessageDialog(null, msg);

    }
}
