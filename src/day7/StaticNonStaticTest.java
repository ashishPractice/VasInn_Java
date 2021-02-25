package day7;

public class StaticNonStaticTest {

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
