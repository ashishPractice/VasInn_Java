package day10;

public class ArrayDemo6 {
    public static void main(String[] args) {
        final int ROW = 3;
        final int COLUMNS = 3;

        int[][] arr= new int[ROW][COLUMNS];

        arr[0][0] = 00;
        arr[0][1] = 01;
        arr[0][2] = 02;
        arr[1][0] = 10;
        arr[1][1] = 11;
        arr[1][2] = 12;
        arr[2][0] = 20;
        arr[2][1] = 21;
        arr[2][2] = 22;

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();

        }
    }
}
