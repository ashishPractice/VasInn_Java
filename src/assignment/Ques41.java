package assignment;

import javax.swing.*;

public class Ques41 {
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter a word");

        char[] letter = word.toCharArray();

        String msg = "";

        for (int i = 0; i < letter.length; i++) {
            for (int j = i + 1; j < letter.length; j++) {
                if (letter[i] == letter[j]) {
                    if(msg.contains(String.valueOf(letter[i]))){

                    }else{
                        msg = msg + letter[i] + ", ";
                    }
                   break;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "The duplicate letter in "+ word+" word are: " +msg);
    }
}
