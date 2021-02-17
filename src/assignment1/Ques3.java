/*Java program to find sum and average of two numbers input by User*/

package assignment1;

import javax.swing.*;

public class Ques3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter first number:: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter second number:: "));

        int sum = a + b;

        double average = sum / 2.0;

//        String result  = "The sum of "

        JOptionPane.showMessageDialog(null, "The sum of two number is "+sum+
                " and their average is "+average);
    }
}

