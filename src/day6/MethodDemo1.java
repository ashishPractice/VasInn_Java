package day6;

public class MethodDemo1 {

    // method declaration
     public void sayHello(){
         System.out.println("Hello from Arlington, Texas");
     }

     public void displayInfo(String name, int age, double salary){
         System.out.println("Name: "+name);
         System.out.println("Age: "+age);
         System.out.println("Salary: "+salary);
     }

    public static void main(String[] args) {
        System.out.println("Main start");

        MethodDemo1 m =  new MethodDemo1();

        //method call
        System.out.println("Method 1");
        m.sayHello();

        System.out.println("\nMethod 2");
        m.displayInfo("Ashish", 28,60000.00);

        String name = "Bishal";
        int age = 30;
        double salary = 60000.0;

        System.out.println("\nMethod 3");
        m.displayInfo(name,age,salary);

        System.out.println("Main end");
    }
}
