/*
Java program to find the area of a circle, rectangle, and triangle.
 */
package assignment2;

import javax.swing.*;

public class Ques5 {
    public static void main(String[] args) {
        // defining constant
        final double PI = 3.1429;

        // variable declaration
        double area;
        char ch;

        // starting of loop
        do {
            String msg = "Enter your choice to calculate Area of \n1. Rectangle\n2. Circle\n3. Traingle";
            int choice = Integer.parseInt(JOptionPane.showInputDialog(msg));

            // begining of switch
            switch (choice) {
                case 1:
                    // Computing area of Rectangle
                    double length = Double.parseDouble(JOptionPane.showInputDialog("Length:: "));
                    double breadth = Double.parseDouble(JOptionPane.showInputDialog("Breadth:: "));
                    area = length * breadth;
                    JOptionPane.showMessageDialog(null, "Area of Rectangle is " + area);
                    break;

                case 2:
                    // Computing area of Circle
                    double radius = Double.parseDouble(JOptionPane.showInputDialog("Radius:: "));
                    area = PI * Math.pow(radius, 2);
                    JOptionPane.showMessageDialog(null, "Area of Circle is " + area);
                    break;

                case 3:
                    // Computing area of Triangle
                    double height = Double.parseDouble(JOptionPane.showInputDialog("Height:: "));
                    double base = Double.parseDouble(JOptionPane.showInputDialog("Base:: "));
                    area = 0.5 * height * base;
                    JOptionPane.showMessageDialog(null, "Area of Triangle is " + area);
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

