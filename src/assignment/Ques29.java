/*
Java program for the performing mathematical expression
 */
package assignment;

import javax.swing.*;

public class Ques29 {
    public static void main(String[] args) {
        // User input
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter number of term:"));

        // variable declaration and initialization
        double a = 1.0;
        String msg = "1";
        int fact;

        // looping from 2nd  till n term
        for (int i = 2; i <= n; i++) {
            fact = 1;
            // calculating the factorial
            for (int j = 1; j <= i; j++) {
                fact = fact + j;
            }
            msg  = msg + " + "+i+"/"+i+"!";
            // computing the mathematical expression
            a = a + (double)i/fact;
        }

        // Displaying the result
        msg = msg + String.format("\n The final value of a = %.2f", a);
        JOptionPane.showMessageDialog(null, msg);
    }
}
