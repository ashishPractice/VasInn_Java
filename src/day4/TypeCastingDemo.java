package day4;

public class TypeCastingDemo {
    public static void main(String[] args) {
        // Boolean have no type conversion

        System.out.println("Implicit type Casting Example");
        // implicit type casting small to big
        // byte -> short -> int -> long -> float -> double
        // Done by java compiler
        byte b1 = 127;
        int i1 = b1;
        System.out.println(b1);
        System.out.println(i1);

        // explicit type casting big to small
        // double -> float -> long -> int -> short -> byte
        // Done by java programmer
        System.out.println("=============================================");
        System.out.println("Explicit type Casting Example");
        int i2 = 123;
        //  byte b2 =  cannot be done implicitly
        byte b2 = (byte) i2;
        System.out.println(i2);
        System.out.println(b2);

        int i3 = 200;
        //  byte b2 =  cannot be done implicitly
        byte b3 = (byte) i3;
        System.out.println(i3);
        System.out.println(b3); // Give the garbage value as it is greater than max value

        System.out.println("=============================================");
        System.out.println("Implicit type Casting Example");

        byte b = 127;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

        System.out.println("=============================================");
        System.out.println("Explicit type Casting Example");

        double d11 = 100.98;
        float f11 = (float) d11;
        long l11 = (long) f11;
        int i11 = (int) l11;
        short s11 = (short) i11;
        byte b11 = (byte) s11;

        System.out.println(d11);
        System.out.println(f11);
        System.out.println(l11);
        System.out.println(i11);
        System.out.println(s11);
        System.out.println(b11);

        System.out.println("=============================================");
        System.out.println("char and byte Example");

        // char and byte

        // Explicit
        char c1 = 65;
        byte b21 = (byte)c1;
        System.out.println(c1);
        System.out.println(b21);

        byte b23 = 65;
        char c3 = (char) b23;
        System.out.println(b23);
        System.out.println(c3);

        // Implicit
        char c2 = 'a';
        byte b22 = 'a';
        System.out.println(c2);
        System.out.println(b22);


    }
}
