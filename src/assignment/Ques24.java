/*
Java program to print the factorial number of given numbers.
 */

package assignment;

import javax.swing.*;

public class Ques24 {
    public static void main(String[] args) {
        // USer input
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter number:"));
        int fact = 1; // initializing variable to 1

        // looping till number to calculate factorial of that number
        for (int i = 1; i <= num ; i++) {
            fact = fact * i;
        }

        // Displaying the result
        JOptionPane.showMessageDialog(null,"The factorial of "+num+" is: "+ fact);
    }
}
