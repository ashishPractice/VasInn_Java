/*
Java program to reverse the element of an array
 */

package assignment;

import javax.swing.*;

public class Ques34 {
    public static void main(String[] args) {
        // user input
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter number of terms"));

        // declaration and instantiation of array
        int[] num = new int[n];

        // n user input
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter " + (i + 1) + " number"));
        }

        // Reversing the element in an array
        int temp;
        for (int i = 0; i < n / 2; i++) {
            // swapping of 1st and last term
            temp = num[i];
            num[i] = num[n-1-i];
            num[n-1-i] = temp;
        }

        // Displaying the result
        String msg = "The Reverse of number are::\n";
        for (int i = 0; i < n; i++) {
            msg = msg + num[i] + ", ";
        }
        JOptionPane.showMessageDialog(null, msg);

    }
}
