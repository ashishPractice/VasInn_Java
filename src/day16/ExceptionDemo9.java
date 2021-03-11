package day16;

class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(String msg){
        super(msg);
    }
}

public class ExceptionDemo9 {

    public static void main(String[] args) {
        vote(17);
        System.out.println("Exit");
    }

    public static void vote(int age) {
        if (age > 18) {
            System.out.println("You can vote");
        } else {
            throw new InvalidAgeException("You cannot vote");
        }
    }
}