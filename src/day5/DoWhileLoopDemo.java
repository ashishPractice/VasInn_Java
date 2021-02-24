package day5;

public class DoWhileLoopDemo {
    public static void main(String[] args) {
        int i = 0, n = 5;
        int sum = 0;

        System.out.println("Simple example of do-while");
        do {
            System.out.println(i);
            sum += i;
            i++;
        } while (i < n);
        System.out.println("Sum of nth term is::" + sum);

        System.out.println("\n\nAnother example of do-while");
        int a = 15;
        do {
            System.out.println("Value of a is:" + a);
        } while (a < 10);
    }
}
