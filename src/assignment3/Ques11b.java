/*
Java program to swap two numbers without using temp variable
 */

package assignment3;

import javax.swing.*;

public class Ques11b {
    public static void main(String[] args) {
        // user input
        int a = Integer.parseInt(JOptionPane.showInputDialog("a"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("b"));

        String result = "Before swap\n a = "+ a +"\n b = "+b;

        // swap without temp variable
        a = a + b;
        b = a - b;
        a = a - b;

        result  = result + "\nAfter swap\n a = "+ a +"\n b = "+b;

        //Displaying result
        JOptionPane.showMessageDialog(null, result);

    }
}
