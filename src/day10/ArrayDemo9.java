package day10;

public class ArrayDemo9 {
    public static void main(String[] args) {
        String[][] names = new String[][] {{"Ram","Hari","Shyam"},{"Ashish","Bishal","Kapil"},{"Ritu","Roshnee","Palistha"}};

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length; j++) {
                System.out.print(names[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
