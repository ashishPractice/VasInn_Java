package assignment;

import javax.swing.*;

public class Ques39 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your full Name");

        // getting last space index
        int index = name.lastIndexOf(" ");

        String msg = String.valueOf(Character.toUpperCase(name.charAt(0))) + ". ";

        char ch;

        for (int i = 1; i < index; i++) {
            ch = name.charAt(i);
            if(ch != ' ')
                continue;

            i++;
            msg = msg + String.valueOf(Character.toUpperCase(name.charAt(i))) + ". ";
        }

        msg = msg + String.valueOf(Character.toUpperCase(name.charAt(index+1)));

        for (int i = index+2; i < name.length(); i++) {
            msg = msg + name.charAt(i);
        }

        JOptionPane.showMessageDialog(null,msg);

    }
}
