/*
Java program for the Mathematical Function
 */

package assignment2;

import javax.swing.*;

public class Ques10b {
    public static void main(String[] args) {
        double s = Double.parseDouble(JOptionPane.showInputDialog("s"));
        double a = Double.parseDouble(JOptionPane.showInputDialog("a"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("b"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("c"));

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        JOptionPane.showMessageDialog(null, String.format("s :: %.2f",area));

    }
}
