/*
Java program display the patterns
 */
package assignment;

import javax.swing.*;

public class Ques31 {
    public static void main(String[] args) {
        String msg = "";
        // looping from 1 to 5
        for (int i = 1; i <= 5 ; i++) {
            // looping from 1 to outer loop
            for (int j = 1; j <=i ; j++) {
                msg = msg + j + " ";
            }
            msg = msg+ "\n";

        }

        // Displaying the result
        JOptionPane.showMessageDialog(null,msg);
    }
}
