package day15;

public class StringDemo5 {

    public static void main(String[] args) {
        String s1 = "Hello,I am Ashish Shrestha,I am a Junior Software Engineer";
        System.out.println(s1);

        String[] result = s1.split(",");

        for (String s : result) {
            System.out.println(s);
        }
    }
}
