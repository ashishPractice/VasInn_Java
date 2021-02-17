/*
Java program to display numbers in ascending order in array.
 */

package assignment;

import javax.swing.*;

public class Ques33 {
    public static void main(String[] args) {
        // User input
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter number of terms"));

        // declaration and instantiation of array
        int[] num = new int[n];

        // Taking n user input
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter " + (i + 1) + " number"));
        }

        // sorting in ascending order
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        // Displaying the result

        String msg = "The number in ascending order are::\n";
        for (int i = 0; i < n; i++) {
            msg = msg + num[i] + ", ";
        }
        JOptionPane.showMessageDialog(null, msg);

    }
}
