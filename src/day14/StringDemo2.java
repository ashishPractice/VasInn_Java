package day14;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = "Nepal";
        String s2 = "Nepal";

        String s3 = new String("Nepal");
        String s4 = new String("Nepal");

        //compare the reference
        System.out.println(s1==s2); // true
        System.out.println(s1==s3); // false
        System.out.println(s3==s4); // false

        // compare the contains
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s4.equals(s3)); // true

        // cases is different
        String s5 = "nepal";
        System.out.println(s1.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s5));

    }
}
