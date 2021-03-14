package day18;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo3 {

    public static void main(String[] args) {
        File file = new File("Demo1.txt");

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canExecute());
        file.setWritable(false);
        System.out.println(file.canWrite());
        System.out.println(file.isHidden());

        System.out.println(new Date(file.lastModified()));
        System.out.println(file.length());

        String filepath = "/Users/ashishshrestha/Documents/GitHub/VastinaInn_Java/Demo1/Test.txt";
        File file1 = new File(filepath);
        file.renameTo(file1);

        try {
            if (file1.createNewFile()) {
                System.out.println("New file created");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        file1.delete();

        System.out.println(file1.exists());


    }
}
