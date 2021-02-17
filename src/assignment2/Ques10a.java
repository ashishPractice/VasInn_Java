/*
Java program for the Mathematical Function
 */

package assignment2;

import javax.swing.*;

public class Ques10a {
    public static void main(String[] args) {
        double u = Double.parseDouble(JOptionPane.showInputDialog("u"));
        double t = Double.parseDouble(JOptionPane.showInputDialog("t"));
        double a = Double.parseDouble(JOptionPane.showInputDialog("a"));

        double s = (u * t) + 1 / 2.0 * a * Math.pow(t, 2);

        JOptionPane.showMessageDialog(null, String.format("s:: %.2f", s));

    }
}
