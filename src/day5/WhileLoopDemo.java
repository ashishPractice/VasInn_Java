package day5;

public class WhileLoopDemo {
    public static void main(String[] args) {
        int i = 0, n = 5;
        int sum = 0;

        while(i<n){
            System.out.println(i);
            sum += i;
            i++;
        }
        System.out.println("Sum of nth term is::" + sum);
    }
}
