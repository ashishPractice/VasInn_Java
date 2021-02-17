/*
Java program to calculate Simple Interest
 */

package assignment2;

import javax.swing.*;

public class Ques4 {
    public static void main(String[] args) {

        //Asking user input
        double principle = Double.parseDouble(JOptionPane.showInputDialog("Principle:: "));
        double rate = Double.parseDouble(JOptionPane.showInputDialog("Rate:: "));
        double time = Double.parseDouble(JOptionPane.showInputDialog("Time:: "));

        //Simple interest formula
        double si = principle * time * rate / 100.0;

        // Displaying result
        JOptionPane.showMessageDialog(null, "Simple Interest:: " + si);

    }
}
