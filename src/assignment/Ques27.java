/*
Java program to sum each digit of given number as well as product
 */

package assignment;

import javax.swing.*;

public class Ques27 {
    public static void main(String[] args) {
        // User input
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter number::"));

        // declaration and initialization of variable
        int rem, sum = 0, prod = 1;
        int temp = num;

        // looping until number = 0
        while (num != 0) {
            rem = num % 10; // getting the remiandef
            sum = sum + rem; // sum of digits
            prod = prod * rem; // product of digit
            num = num / 10; // dividing the number
        }

        // Displaying the result
        String msg = "The sum of "+ temp+" = "+ sum+
                "\nThe product of "+ temp+" = "+ prod;
        JOptionPane.showMessageDialog(null, msg);
    }
}
