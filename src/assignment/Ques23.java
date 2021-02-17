/*
Java program to sum 1 to nth natural numbers
 */

package assignment;

import javax.swing.*;

public class Ques23 {
    public static void main(String[] args) {
        // User input
        int term = Integer.parseInt(JOptionPane.showInputDialog("Enter number of term:"));
        int sum = 0; // initializing sum to 0

        // looping till n term and calculate sum
        for (int i = 0; i <= term ; i++) {
            sum = sum + i;
        }

        // Displaying the result
        JOptionPane.showMessageDialog(null,"The sum upto "+term+" term is: "+ sum);
    }
}
