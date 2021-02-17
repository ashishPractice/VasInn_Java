package assignment;

public class Ques43 {

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int d = 0;
        int result;

        try{
           // result = 25/d;
            result= num[6];
        }catch (ArithmeticException ae){
            ae.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
