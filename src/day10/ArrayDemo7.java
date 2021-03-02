package day10;

import java.util.Scanner;

public class ArrayDemo7 {
    public static void main(String[] args) {
        final int ROW = 3;
        final int COLUMNS = 3;

        int[][] arr= new int[ROW][COLUMNS];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print("Enter value:: ");
                arr[i][j] = scan.nextInt();
            }

        }

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();

        }
    }
}
