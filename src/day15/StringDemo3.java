package day15;

public class StringDemo3 {
    public static void main(String[] args) {

        String s1 = "good morning";
        System.out.println(s1);

        System.out.println(s1.length());

        System.out.println(s1.substring(5));
        System.out.println(s1.substring(0,4));

        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());

        System.out.println(s1.indexOf('m'));

        System.out.println(s1.charAt(5));

        System.out.println(s1.contains("morning"));
        System.out.println(s1.contains("m"));
        System.out.println(s1.contains("x"));

        System.out.println(s1.concat(". How are you"));
        System.out.println("Hello!!! ".concat(s1));

        char[] ch = s1.toCharArray();
        System.out.println(ch[0]);

        System.out.println(s1.isEmpty());
        String s2 = "";
        System.out.println(s2.isEmpty());

        System.out.println(s1.replace("morning","evening"));

        String s3 = " Dallas, Texas, US   ";
        System.out.println(s3);
        System.out.println(s3.trim());

        System.out.println(s1.compareTo(s1)==0);
        System.out.println(s1.compareTo(s3)>0);
        System.out.println(s1.compareTo(s2)<0);

    }
}
