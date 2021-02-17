package assignment;

import javax.swing.*;

public class Ques37 {
    public static void main(String[] args) {
        int[][] num1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] num2 = {{4, 5, 6}, {2, 7, 8}, {3, 1, 9}};
        
        int[][] sum = new int[num1.length][num1[0].length];

        String msg = "The sum of two matrix are::\n";
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[0].length; j++) {
                sum[i][j] = num1[i][j]+num2[i][j];
                msg = msg + sum[i][j] + "\t";
            }
            msg = msg + "\n";
        }

        JOptionPane.showMessageDialog(null,msg);

    }
}
