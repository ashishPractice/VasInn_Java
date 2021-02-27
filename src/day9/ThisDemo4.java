package day9;

public class ThisDemo4 {

    public ThisDemo4 getObject() {
        /* method 1
        ThisDemo4 ob = new ThisDemo4();
        return ob;

        method 2
        return new ThisDemo4
         */

        // method 3
        return this;

    }

    public void greet() {
        System.out.println("Hello!! Goodmorning");
    }


    public static void main(String[] args) {
       ThisDemo4 obj =  new ThisDemo4();
       ThisDemo4 ob = obj.getObject();

       obj.greet();
    }
}
