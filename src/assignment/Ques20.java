/*
Write a program to create the equivalent of a four-function calculator.
The program to enter two integer’s numbers and an operator.
It then carries out the specified arithmetic operator operation: addition, subtraction, multiplication or division of the two numbers.
Finally, it displays the result
 */
package assignment;

import javax.swing.*;

public class Ques20 {
    public static void main(String[] args) {
        char ch;
        do { // start of loop
            // user inputs
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Number 1:: "));
            String msg = "Enter your choice\n1. Addition(+)\n2. Substraction(-)\n3. Multiplication(*)\n 4. Division(/)";
            char choice = JOptionPane.showInputDialog(msg).charAt(0);
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Number 2:: "));

            switch (choice) { // start of switch
                case '+':
                    // Addition of number
                    JOptionPane.showMessageDialog(null, num1 + " + "+num2+ " = "+ (num1+num2));
                    break;

                case '-':
                    // Substraction of number
                    JOptionPane.showMessageDialog(null, num1 + " - "+num2+ " = "+ (num1-num2));
                    break;

                case '*':
                    // Product of number
                    JOptionPane.showMessageDialog(null, num1 + " * "+num2+ " = "+ (num1*num2));
                    break;

                case '/':
                    // Division of number
                    JOptionPane.showMessageDialog(null, num1 + " / "+num2+ " = "+ (num1/num2));
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice");
            } // end of switch
            String wana = JOptionPane.showInputDialog("Wana Continue(Y/N):: ");
            ch = wana.charAt(0);

        } while (ch == 'Y' || ch == 'y'); // end of loop

    }
}

