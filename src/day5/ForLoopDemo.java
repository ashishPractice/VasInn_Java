package day5;

public class ForLoopDemo {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(i);
            sum += i;

        }
        System.out.println("Sum of nth number is:: " + sum);
    }
}
