/*
Java program to accept three sides of a triangle and display which kind of triangle is formed
 */

package assignment;

import javax.swing.*;

public class Ques19 {
    public static void main(String[] args) {
        // User inputs
        int side1 = Integer.parseInt(JOptionPane.showInputDialog("Side 1"));
        int side2 = Integer.parseInt(JOptionPane.showInputDialog("Side 2"));
        int side3 = Integer.parseInt(JOptionPane.showInputDialog("Side 3"));

        // Checking for equilateral triangle
        if (side1 == side2 && side2 == side3 )
            JOptionPane.showMessageDialog(null,"Equilateral Triangle");

        // Checking for isoceles triangle
        else if (side1 == side2 || side2 == side3 || side3 == side1 )
            JOptionPane.showMessageDialog(null,"Isoceles Triangle");

        // Otherwise scalene triangle
        else
            JOptionPane.showMessageDialog(null,"Scalene Triangle");
    }
}
