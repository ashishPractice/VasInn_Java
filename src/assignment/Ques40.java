package assignment;

import javax.swing.*;

public class Ques40 {
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter a String");


//        Using hard code
        char letter[]  = word.toCharArray();

        char temp;
        for (int k = 0; k < letter.length/2; k++) {
            temp = letter[k];
            letter[k] = letter[letter.length-1-k];
            letter[letter.length-1-k] = temp;
        }

        String result = String.valueOf(letter);

        JOptionPane.showMessageDialog(null, "The reverse of "+word+ "is "+result);


//        Using String Locale.Builder
//        StringBuilder result = new StringBuilder();
//
//        result.append(word);
//        result.reverse();
//
//        JOptionPane.showMessageDialog(null, "The reverse of " + word + " is " + result);

    }
}
