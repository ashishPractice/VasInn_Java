package day11;

public class MethodDemo2 {

    public void printElemetofAnArray(int[] arr) {
        for (int a : arr) {
            System.out.println(a);
        }
    }

    // variable argument and it should be a last argument
    public void printElemetofAnArray1(int... arrs) {
        for (int a : arrs) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        MethodDemo2 obj = new MethodDemo2();

        obj.printElemetofAnArray(arr);

        obj.printElemetofAnArray(new int[]{40,50,60});

        obj.printElemetofAnArray1(40,50,60,70);
    }

}
