package day2;

public class DataTypes {
    public static void main(String[] args) {
//        byte b1 = 127; //max value
//        byte b2 = -128; // min value

//        short s1 = 32767; //max value
//        short s2 = -32768; // min value

//        int i1 = 2147483647; //max value
//        int i2 = -2147483648; // min value
//
//        char c1 = 0; // max value
//        char c2 = 65535; // min value

//        long l1 = 9223372036854775807L; // max value
//        long l2 = -9223372036854775808L; // min value

//        float f1 = 3.4028235E38F; // max value
//        float f2 = 1.4E-45F; // min value

        // Note: It is not necessary to write D after value in double
        double d1 = 1.7976931348623157E308; // max value
        double d2 = 4.9E-324; // min value

        // boolean does not have max and min value



        System.out.println("========Bytes info===========");
        System.out.println(Byte.BYTES);
        System.out.println(Byte.SIZE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println("========Short info===========");
        System.out.println(Short.BYTES);
        System.out.println(Short.SIZE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println("========Integer info===========");
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println("========Long info===========");
        System.out.println(Long.BYTES);
        System.out.println(Long.SIZE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        System.out.println("========Float info===========");
        System.out.println(Float.BYTES);
        System.out.println(Float.SIZE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);


        System.out.println("========Double info===========");
        System.out.println(Double.BYTES);
        System.out.println(Double.SIZE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
    }
}
