package day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo5 {
    public static void main(String[] args) {
        String filePath = "/Users/ashishshrestha/Documents/GitHub/VastinaInn_Java/Log";
        String filePath1 = "/Users/ashishshrestha/Documents/GitHub/VastinaInn_Java/Demo1/Log2.txt";

        // After and in Java 7 we do not need to used finally block rather we used try with resource block
        try (
                // Reading and writing in byte
                FileInputStream fin = new FileInputStream(filePath);
                FileOutputStream fout = new FileOutputStream(filePath1);
        ) {
            int len;

            while ((len = fin.read()) != -1) {
                System.out.println(len);
                fout.write(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
