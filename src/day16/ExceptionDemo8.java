package day16;

public class ExceptionDemo8 {

    public static void main(String[] args) {
        vote(17);
        System.out.println("Exit");
    }

    public static void vote(int age){
        if(age > 18){
            System.out.println("You can vote");
        }else{
            throw new ArithmeticException("You cannot vote");
        }
    }
}
