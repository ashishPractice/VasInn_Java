package day18;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

    public static void main(String[] args)  {
        File file = new File("Demo1.txt");

        try {
            if(file.createNewFile()){
                System.out.println("File created");
            }else{
                System.out.println("File already exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
