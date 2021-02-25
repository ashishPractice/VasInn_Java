package day7;

public class ObjectDemo3 {
    public static void main(String[] args) {
        System.out.println(new ObjectDemo2().hashCode());

        System.out.println("=============================");

        ObjectDemo2 obj;
        obj = new ObjectDemo2();
        System.out.println(obj.hashCode());


        System.out.println("=============================");

        ObjectDemo2 obj2 = new ObjectDemo2();
        System.out.println(obj2.hashCode());

        System.out.println("=============================");

        // Generating self hascode
        System.out.println(obj2);
        System.out.println("day6.ObjectDemo3@" + Integer.toHexString(obj2.hashCode()));

    }
}
