package day15;

import java.util.StringTokenizer;

public class StringDemo6 {
    public static void main(String[] args) {
        String s1 = "Hello, I am Ashish Shrestha, I am a Junior Software Engineer";
        System.out.println(s1);

        // split by space
        StringTokenizer st = new StringTokenizer(s1);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        // split by ,
        StringTokenizer st1 = new StringTokenizer(s1,",");
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }



    }
}
