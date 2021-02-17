/*
Java program to find duplicate elements in an array using function
 */
package assignment;

import javax.swing.*;

public class Ques36 {

    // function that find the duplicate element in an array
    static String duplicated(int[] num){
        String msg = "";
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                // checking if two element are same or not
                if (num[i] == num[j]) {
                    // checking if element already repeated or not
                    if (msg.contains(String.valueOf(num[i]))){
                    }else{
                        msg = msg + num[i] + ", ";
                    }
                    break;
                }
            }
        }
        return msg;
    }

    public static void main(String[] args) {
        //array initialization
        int[] num = {1, 2, 2, 3, 3, 4, 5, 6, 6, 7, 8, 2, 8, 9, 10, 10};
        String msg = "The repeated element in an array are::\n";

        // function call
        String result = duplicated(num);

        // Displaying result
        JOptionPane.showMessageDialog(null, msg+result);
    }
}
