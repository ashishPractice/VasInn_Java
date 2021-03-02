package day10;

public class ArrayDemo11 {
    public static void main(String[] args) {
        String[][] names = new String[][] {{"Ram","Hari","Shyam"},{"Ashish","Bishal","Kapil"},{"Ritu","Roshnee","Palistha"}};

        for (String[] name: names) {
            for (String x: name) {
                System.out.print(x+"\t");
            }
            System.out.println();
        }
    }
}
