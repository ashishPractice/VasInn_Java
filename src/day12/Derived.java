package day12;

public class Derived extends Base{

    public Derived(){
        System.out.println("Derived child default constructor");
    }

    public Derived(int a){
        super(a);
        System.out.println("Derived child arg constructor");
    }
}
