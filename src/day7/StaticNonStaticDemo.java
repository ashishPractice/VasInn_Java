package day7;

public class StaticNonStaticDemo {

    // class variable
    String nonStaticVar = "This is non static variable";
    static String staticVar = "This is static variable";

    public void nonStaticMethod() {
        System.out.println("This is non static method");
    }

    public static void staticMethod() {
        System.out.println("This is static method");
    }


    public static void main(String[] args) {
        //local variable
        int a = 5;

        // Calling non static
        StaticNonStaticDemo obj = new StaticNonStaticDemo();
        System.out.println(obj.nonStaticVar);
        obj.nonStaticMethod();

        //Calling static
        System.out.println(StaticNonStaticDemo.staticVar);
        StaticNonStaticDemo.staticMethod();




    }
}
