package day8;

public class Student {
    String name;
    int roll;

    public Student(String n, int r){
        name = n;
        roll = r;
    }

    public void displayInfo(){
        System.out.println("Name:"+name);
        System.out.println("Roll:"+roll);
    }

    public static void main(String[] args) {
        Student std = new Student("Ram",01);
        std.displayInfo();
        Student std1 = new Student("Shayam",2);
        std1.displayInfo();
    }
}

/* Characteristics of Constructor
    1. It's name is same as class name
    2. It has no return type
    3. we cannot use void keyword too.
    4. It can have access modifiers
    5. It runs only for each object
    6. It is mainly used to initialize the member data.

 */

/*
class: It is specification/model/prototype
object: instance of class
 */

