package day15;

import java.util.StringTokenizer;

public class StringDemo7 {
    public static void main(String[] args) {
        String s1 = "Hello,, I am Ashish Shrestha,, I am a Junior Software Engineer";
        System.out.println(s1);

        String[] result = s1.split(",");
        System.out.println(result.length);

        for (String s : result) {
            System.out.println(s);
        }
        System.out.println("=========================");

        StringTokenizer st1 = new StringTokenizer(s1,",");
        System.out.println(st1.countTokens());
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }
    }
}
