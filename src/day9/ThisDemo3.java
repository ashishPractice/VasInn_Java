package day9;

public class ThisDemo3 {

    public void display(){
        System.out.println("This is concepts of this");
    }

    public void print(ThisDemo3 ob){
        ob.display();
    }

    public void show(){
        print(this);

        /* else yo have to do
         ThisDemo3 ob = new ThisDemo3();
         print(ob);
         */
    }

    public static void main(String[] args) {
        ThisDemo3 ob = new ThisDemo3();
        ob.show();
    }
}
