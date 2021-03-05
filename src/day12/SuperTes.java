package day12;

public class SuperTes {

    public static void main(String[] args) {

        // Implicit type-casting (Up casting)
        Super obj = new Sub();
        obj.sayHello();

        // Explicit type-casting
        Super ob = new Super();
        Sub sub = (Sub) ob;

    }
}
