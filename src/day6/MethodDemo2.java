package day6;

public class MethodDemo2 {

    public static String greet(){
        String greet = "Hello, Goodmorning from Texas";
        return greet;
    }

    public static int findMax(int a, int b){
        int max = (a>b)?a:b;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(greet());

        int max = findMax(5,4);
        System.out.println("Max between 5 and 4 is:"+ max);


    }
}
