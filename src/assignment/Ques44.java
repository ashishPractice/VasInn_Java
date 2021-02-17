package assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

class Student implements java.io.Serializable {
    public String name;
    public String address;
}

public class Ques44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student[] std = new Student[3];
        for (int i = 0; i < 3; i++) {
            std[i] = new Student();
            System.out.println("Enter " + (i + 1) + " employee data");
            System.out.println("Enter name");
            std[i].name = scan.nextLine();
            System.out.println("Enter address");
            std[i].address = scan.nextLine();
        }

        //Writing in a file
        FileOutputStream fout;
        ObjectOutputStream out;
        try {
            fout = new FileOutputStream("Student.txt");
            out = new ObjectOutputStream(fout);
            out.writeObject(std);
            out.close();
            fout.close();
        } catch (Exception ei) {
            ei.printStackTrace();
        }


        //Reading from a file
        std = null;
        FileInputStream fin;
        ObjectInputStream in;
        try {
            fin = new FileInputStream("Student.txt");
            in = new ObjectInputStream(fin);

            std = (Student[]) in.readObject();
        } catch (Exception ei) {
            ei.printStackTrace();
        }
        System.out.println("The values are");

        System.out.println("Enter your name to search address:");
        String add = scan.nextLine();

        boolean found = false;

        //search in a file
        for (Student s : std) {
            if (add.equalsIgnoreCase(s.name)) {
                System.out.println(s.name + " lives in " + s.address);
                found = true;
                break;
            }

        }
        if(!found){
            System.out.println("No result found!!!!");
        }
    }

}

