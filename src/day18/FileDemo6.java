package day18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo6 {
    public static void main(String[] args) {

        String filePath = "/Users/ashishshrestha/Documents/GitHub/VastinaInn_Java/log";
        String filePath1 = "/Users/ashishshrestha/Documents/GitHub/VastinaInn_Java/Demo1/Log3.txt";

        try (
                // Read and write character wise
                FileReader fr = new FileReader(filePath);
                FileWriter fw = new FileWriter(filePath1);
        ) {

            int len;

            while ((len = fr.read()) != -1) {
                char character = (char) len;
                System.out.println(character);
                fw.write(len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
