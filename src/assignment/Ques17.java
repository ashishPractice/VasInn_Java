/*
Java program to calculate leap year
 */

package assignment;

import javax.swing.*;

public class Ques17 {
    public static void main(String[] args) {
        // User input
        int year = Integer.parseInt(JOptionPane.showInputDialog("Enter Year:"));

        boolean leap = false; // variable declaration and initialization

        // if the year is divided by 4
        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {

                // if year is divided by 400
                // then it is a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }

            // if the year is not century
            else
                leap = true;
        } else
            leap = false;

        // Displaying result after checking the condition
        if (leap)
            JOptionPane.showMessageDialog(null, year + " is a leap year.");
        else
            JOptionPane.showMessageDialog(null, year + " is a not leap year.");
    }
}

