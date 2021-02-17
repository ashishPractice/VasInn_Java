/*
Java program to relate two integers entered by the user using = =or > or < sign
 */

package assignment3;

import javax.swing.*;

public class Ques14 {
    public static void main(String[] args) {
        // User inputs
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("First number:: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Second number:: "));

        // Comparing two values and displaying result
       if(num1 >  num2){
            JOptionPane.showMessageDialog(null, num1+ " is greater than "+num2);
        }else if(num1 < num2){
           JOptionPane.showMessageDialog(null, num2+ " is greater than "+num1);
        }else{
           JOptionPane.showMessageDialog(null, num1+ " and "+num2 + " are equal");

        }



    }
}
