/*
Which cannot be inherit
    private member
    hidden variable
    overidden constructor
 */



package day12;

public class ParentChildTest {
    public static void main(String[] args) {
        Parent obj =  new Parent();
        System.out.println(obj.name);
        obj.sayHello();

        Child obj1 =  new Child();
        System.out.println(obj1.name);
        obj1.sayHello();
    }
}
