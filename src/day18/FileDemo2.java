package day18;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

    public static void main(String[] args)  {
        File file = new File("Demo1");
        file.mkdir();
        System.out.println("Directory created");

    }
}
