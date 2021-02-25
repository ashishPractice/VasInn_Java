package day7;

public class ObjectDemo2 {

    int a;
    String s;

    public static void main(String[] args) {

        System.out.println(new ObjectDemo2()); // prints the id of object
        System.out.println(new ObjectDemo2().a);
        System.out.println(new ObjectDemo2().s);

        System.out.println("=============================");

        ObjectDemo2 obj;
        obj = new ObjectDemo2();
        System.out.println(obj);
        System.out.println(obj.a);
        System.out.println(obj.s);

        System.out.println("=============================");

        ObjectDemo2 obj2 = new ObjectDemo2();
        System.out.println(obj2);
        System.out.println(obj2.a);
        System.out.println(obj2.s);
    }
}
