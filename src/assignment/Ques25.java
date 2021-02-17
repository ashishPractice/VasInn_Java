/*
program that prompts the user to enter the number of students and each student’s name and score.
Finally display the student with the highest score.
 */

package assignment;

import javax.swing.*;

public class Ques25 {
    public static void main(String[] args) {
        //User input
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter number of student:"));

        // initializing the variable
        int maxScore = 0;
        String msg = "";

        // looping till n term
        for (int i = 0; i < n; i++) {
            String name = JOptionPane.showInputDialog("Name:");
            int score = Integer.parseInt(JOptionPane.showInputDialog("Score:"));

            // if current score is greater swapping with maxScore
            if(score > maxScore){
                maxScore = score;
                msg = name + " has a highest score of "+ score;
            }


        }

        // Displaying result
        JOptionPane.showMessageDialog(null, msg);
    }
}
