/*
Java program that converts pounds into kg [1 pound is 0.454 kg]
 */
package assignment2;

import javax.swing.*;

public class Ques9 {
    public static void main(String[] args) {

        // User input
        double pound = Double.parseDouble(JOptionPane.showInputDialog("Pound:: "));

        // Coversion from pound to kg
        double kg = pound * 0.454;

        // Displaying result
        JOptionPane.showMessageDialog(null, pound +" pound = " + kg + " kg");

    }
}
