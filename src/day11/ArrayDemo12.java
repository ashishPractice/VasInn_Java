// Demo of jack array

package day11;

public class ArrayDemo12 {

    public static void main(String[] args) {
        int[][] arr = new int[3][];

        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];

        arr[0][0] = 10;

        arr[1][0] = 10;
        arr[1][1] = 20;

        arr[2][0] = 10;
        arr[2][1] = 20;
        arr[2][2] = 30;

        for (int[] a : arr) {
            for (int x : a) {
                System.out.print(x+" ");
            }
            System.out.println();
        }


    }
}
