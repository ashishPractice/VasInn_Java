/*
Java program to swap two numbers using temp variable
 */

package assignment3;

import javax.swing.*;

public class Ques11a {
    public static void main(String[] args) {

        // User input
        int a = Integer.parseInt(JOptionPane.showInputDialog("a"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("b"));

        String result = "Before swap\n a = "+ a +"\n b = "+b;

        // swap using temp variable
        int temp = a;
        a = b;
        b = temp;

        result  = result + "\nAfter swap\n a = "+ a +"\n b = "+b;

        // Displaying result
        JOptionPane.showMessageDialog(null, result);

    }
}
