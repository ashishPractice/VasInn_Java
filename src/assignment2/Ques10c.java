/*
Java program for the Mathematical Function
 */

package assignment2;

import javax.swing.*;

public class Ques10c {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("a"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("b"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("c"));

        double x = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;


        JOptionPane.showMessageDialog(null, String.format("x :: %.2f", x));

    }
}
