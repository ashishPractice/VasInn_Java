package day7;

public class DefaultValueDemo {

    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    boolean bb;
    String ss;

    static String st;

    DefaultValueDemo ob;


    public static void main(String[] args) {
        DefaultValueDemo obj = new DefaultValueDemo();

        System.out.println(obj.b);
        System.out.println(obj.s);
        System.out.println(obj.i);
        System.out.println(obj.l);
        System.out.println(obj.f);
        System.out.println(obj.d);
        System.out.println(obj.bb);
        System.out.println(obj.ss);
        System.out.println(obj.ob);

        System.out.println(st);

        // Default value of static or non static is same. It does not matter

        // local variable have no default value

        int a;

       // System.out.println(a); // gives us error its must be initialize as it does not have default value



    }
}
