/*
Java program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.
 */

package assignment2;

import javax.swing.*;

public class Ques8 {
    public static void main(String[] args) {
        // variable declaration
        double result;
        char ch;

        do { // start of loop
            String msg = "Enter your choice\n1. Celius to Fahrenheit\n2. Fahrenheit to Celius";
            int choice = Integer.parseInt(JOptionPane.showInputDialog(msg));

            switch (choice) { // start of switch
                case 1:
                    // Conversion of Celius to Fahrenheit
                    double celius = Double.parseDouble(JOptionPane.showInputDialog("Celius:: "));
                    result = (celius * 9/5.0) + 32;
                    JOptionPane.showMessageDialog(null, celius +"C = " + result + "F");
                    break;

                case 2:
                    // // Conversion of Fahrenheit to Celius
                    double fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Fahrenheit:: "));
                    result = (fahrenheit - 32) * 5/9.0;
                    JOptionPane.showMessageDialog(null, fahrenheit +"F = " + result + "C");
                    break;


                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice");
            } // end of switch

            String wana = JOptionPane.showInputDialog("Wana Continue(Y/N):: ");
            ch = wana.charAt(0);

        } while (ch == 'Y' || ch == 'y'); // end of loop

    }
}

