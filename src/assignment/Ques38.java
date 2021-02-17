package assignment;

import javax.swing.*;

public class Ques38 {
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter a String");

        int i = 0, j = word.length() - 1;
        boolean isPalindrome = true;

        while(i<j){
            if(word.charAt(i)!= word.charAt(j)){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if (isPalindrome){
            JOptionPane.showMessageDialog(null,word+" is Palindrome");
        }else{
            JOptionPane.showMessageDialog(null,word+" is not Palindrome");
        }

    }
}
