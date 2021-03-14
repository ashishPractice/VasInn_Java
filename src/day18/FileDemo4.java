package day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) {
        String filePath = "/Users/ashishshrestha/Documents/GitHub/VastinaInn_Java/Log";
        String filePath1 = "/Users/ashishshrestha/Documents/GitHub/VastinaInn_Java/Demo1/Log1.txt";

        FileInputStream fin = null;
        FileOutputStream fout = null;

        try {
            fin = new FileInputStream(filePath);
            fout = new FileOutputStream(filePath1);
            int len;

            while ((len = fin.read()) != -1) {
                System.out.println(len);
                fout.write(len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fin.close();
                fout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
