/*
Java program to input the number of (1...7) and translate to its equivalent name of the day of the week.
 */

package assignment;

import javax.swing.*;

public class Ques21 {
    public static void main(String[] args) {
        // variable declaration
        char ch;
        String msg = "Enter your choice\n1. Sunday\n2. Monday\n3. Tuesday\n 4. Wednesday" +
                "\n5. Thursday\n 6. Friday\n 7. Saturday";
        do { // start of loop
            // User input
            int choice = Integer.parseInt(JOptionPane.showInputDialog(msg));

            switch (choice) { // start of switch
                case 1:
                    JOptionPane.showMessageDialog(null, "Sunday");
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Monday");
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Tuesday");
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Wednesday");
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Thursday");
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Friday");
                    break;

                case 7:
                    JOptionPane.showMessageDialog(null, "Saturday");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice");
            } // end of switch
            String wana = JOptionPane.showInputDialog("Wana Continue(Y/N):: ");
            ch = wana.charAt(0);

        } while (ch == 'Y' || ch == 'y'); // end of loop

    }
}

