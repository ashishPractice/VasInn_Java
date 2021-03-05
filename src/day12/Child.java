package day12;

public class Child extends Parent{
    //hidden variable
    String name ="This is child class";

    // overridden variable
    public void sayHello(){
        System.out.println(super.name);
        System.out.println(name);
        super.sayHello();
        System.out.println("Hello from child");
    }

}
