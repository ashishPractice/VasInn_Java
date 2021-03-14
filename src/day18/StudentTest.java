package day18;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class StudentTest {
    public static void main(String[] args) {

        TreeSet<Student> std = new TreeSet<>(new Student());

        std.add(new Student("Ashish", 28));
        std.add(new Student("Kapil", 27));
        std.add(new Student("Bishal", 30));
        std.add(new Student("Yograj", 28));

        System.out.println(std);
        System.out.println(std.last());

    }

}
