/*Java program to add two number using Jswing*/
package day1;

import javax.swing.*;

public class Addition3 {

    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Input a:: "));
        System.out.println(a);
        int b = Integer.parseInt(JOptionPane.showInputDialog("Input b:: "));


        int sum = a + b;

        JOptionPane.showMessageDialog(null,"The sum is:: "+sum);
    }
}
