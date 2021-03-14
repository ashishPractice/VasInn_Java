package day18;

import java.io.*;

public class FileDemo7 {
    public static void main(String[] args) {

        String filePath = "/Users/ashishshrestha/Documents/GitHub/VastinaInn_Java/log";
        String filePath1 = "/Users/ashishshrestha/Documents/GitHub/VastinaInn_Java/Demo1/Log4.txt";

        try (
                FileReader fr = new FileReader(filePath);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(filePath1);
                BufferedWriter bw = new BufferedWriter(fw);
        ) {

            String len;

            while ((len = br.readLine()) != null) {
                System.out.println(len);
                bw.write(len);
                bw.newLine();
                bw.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
