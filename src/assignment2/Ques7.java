/*
Java program that reads the radius and length of a cylinder and computes volume.
 */

package assignment2;

import javax.swing.*;

public class Ques7 {
    public static void main(String[] args) {
        final double PI = 3.1429; // defining constant

        // User inputs
        double height = Double.parseDouble(JOptionPane.showInputDialog("Height:: "));
        double radius = Double.parseDouble(JOptionPane.showInputDialog("Radius:: "));

        // computing valumn of cylinder
        double volumn = PI * Math.pow(radius,2) * height;

        // Displaying the result
        JOptionPane.showMessageDialog(null, "Volumn of Cylinder:: " + volumn);

    }
}
