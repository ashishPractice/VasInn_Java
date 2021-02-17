/*
Java program to find the perimeter of a circle, rectangle, and triangle.
 */

package assignment2;

import javax.swing.*;

public class Ques6 {
    public static void main(String[] args) {
        final double PI = 3.1429; // defining constant

        // variable declaration
        double perimeter;
        char ch;

        // starting of loop
        do {
            String msg = "Enter your choice to calculate Perimeter of \n1. Rectangle\n2. Circle\n3. Traingle";
            int choice = Integer.parseInt(JOptionPane.showInputDialog(msg));

            switch (choice) {
                case 1:
                    // computing perimeter of rectangle
                    double length = Double.parseDouble(JOptionPane.showInputDialog("Length:: "));
                    double breadth = Double.parseDouble(JOptionPane.showInputDialog("Breadth:: "));
                    perimeter = 2 * (length + breadth);
                    JOptionPane.showMessageDialog(null, "Perimeter of Rectangle is " + perimeter);
                    break;

                case 2:
                    // computing perimeter of circle
                    double radius = Double.parseDouble(JOptionPane.showInputDialog("Radius:: "));
                    perimeter = 2 * PI * radius;
                    JOptionPane.showMessageDialog(null, "Perimeter of Circle is " + perimeter);
                    break;

                case 3:
                    // computing perimeter of triangle
                    double  side1= Double.parseDouble(JOptionPane.showInputDialog("Side1:: "));
                    double  side2= Double.parseDouble(JOptionPane.showInputDialog("Side2:: "));
                    double base = Double.parseDouble(JOptionPane.showInputDialog("base:: "));
                    perimeter = base + side1 + side2;
                    JOptionPane.showMessageDialog(null, "Perimeter of Triangle is " + perimeter);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice");
            } // end of switch

            // User input to ask user to continue program or not
            String wana = JOptionPane.showInputDialog("Wana Continue(Y/N):: ");
            ch = wana.charAt(0);

        } while (ch == 'Y' || ch == 'y'); // end of loop

    }
}

