/*
Java program to reverse the given number
 */

package assignment;

import javax.swing.*;

public class Ques26 {
    public static void main(String[] args) {

        // User input
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter number::"));

        // declaration and initialization of variable
        int rem, rev = 0;
        int temp = num;

        // looping until number = 0
        while (num != 0) {
            rem = num % 10; // getting the remainder
            rev = rev * 10 + rem; // reversing the number
            num = num / 10; // dividing the number
        }

        // Displaying result
        JOptionPane.showMessageDialog(null, "The reverse of "+temp + " = " + rev);
    }
}
