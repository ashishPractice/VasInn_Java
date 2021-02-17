


package assignment;

import javax.swing.*;
import java.io.*;

public class Ques45 {
    public static void main(String[] args) {
        String sen = JOptionPane.showInputDialog("Enter a sentences");


        //Writing in a file
        try {
            FileWriter fw = new FileWriter("Ques45.txt");
            fw.write(sen);
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // reading file a file
        String sentences = "";
        try {
            FileReader fr = new FileReader("Ques45.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null)
                sentences = sentences + line;
            fr.close();
        } catch (
                Exception e) {
            e.printStackTrace();
        }


        // Searching for repeatation
        String[] word = sentences.split(" ");

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

        JOptionPane.showMessageDialog(null, "The duplicate word in " + sen + " sentences are: \n"+ msg);
    }
}
