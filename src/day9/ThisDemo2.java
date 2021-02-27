package day9;

public class ThisDemo2 {

    String name;
    int age;

    public ThisDemo2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }

    public static void main(String[] args) {
        ThisDemo2 ob= new ThisDemo2("ram", 25);
        ob.displayInfo();
    }
}
