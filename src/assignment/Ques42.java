package assignment;

import javax.swing.*;

public class Ques42 {
    public static void main(String[] args) {
        String sen = JOptionPane.showInputDialog("Enter a sentences");

        sen = sen.toLowerCase();

        String[] word = sen.split(" ");

        String msg = "";

        for (int i = 0; i < word.length - 1; i++) {
            for (int j = i + 1; j < word.length; j++) {
                if (word[i].equals(word[j])) {
                    if (msg.contains(word[i])) {

                    } else {
                        msg = msg + word[i] + ", ";
                    }
                    break;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "The duplicate word in " + sen + " sentences are: \n" + msg);
    }
}
