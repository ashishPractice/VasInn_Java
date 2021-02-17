/*
Java program to accept 5 values in an array and display their sum.
 */
package assignment;

import javax.swing.*;

public class Ques32 {
    public static void main(String[] args) {
        // declaration and instantiation of array
        int[] num = new int[5];
        int sum = 0;

        // looping 5 times
        for (int i = 0; i <5; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter "+(i+1)+ " number"));
            sum = sum +num[i]; // suming the number in array
        }

        // Displaying the result
        JOptionPane.showMessageDialog(null,"Sum:: "+sum);
    }
}
