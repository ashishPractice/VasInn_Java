/*
Demo of this
shodowing: process of hiding instance variable by local variable
inside non-static method and constructor of class
value of this cannot be cahnage as it is Final by default
 */

package day9;

public class ThisDemo {

    //instance variable
    int a = 5;

    public void display(int a){
        System.out.println(this.a);
        System.out.println(a);
    }

    public void print() {
        System.out.println(this);
        System.out.println(this.a); // this is used to denote class member
        //local variable
        int a = 6;
        System.out.println(a);
        int sum = this.a + a;
        System.out.println("Sum:" + sum);
    }

    public static void main(String[] args) {
        ThisDemo obj1 = new ThisDemo();
        System.out.println("obj1 is:" + obj1);
        obj1.print();

        System.out.println("================");

        ThisDemo obj2 = new ThisDemo();
        System.out.println("obj2 is:" + obj2);
        obj2.print();
        obj2.display(10);
    }
}
