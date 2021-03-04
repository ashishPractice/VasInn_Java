package day11;

public class MainConceptDemo {

    public static void main(String[] args) {
        System.out.println(args);
        printName(new String[] {"Ram","2.3","10"});
    }


    public static void printName(String[] names){
        for(String name: names){
            System.out.println(name);
        }
    }
}
