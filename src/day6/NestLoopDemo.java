package day6;

public class NestLoopDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3)
                    break;
                System.out.println("i:" + i + " j:" + j + " ");

            }
            System.out.println();
        }
        System.out.println("Out of loop");
    }
}
