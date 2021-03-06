package day13;

public class AdditionDemo {

    public void sum(int a, int b) {
        int s = a + b;
        System.out.println("1. Sum is::" +s);
    }

    public void sum(int a, int b, int c) {
        int s = a + b + c;
        System.out.println("2. Sum is::" +s);
    }

    public void sum(double a, double b) {
        double s = a + b;
        System.out.println("3. Sum is::" +s);
    }

    public static void main(String[] args) {

        //Compile time polymorphism (static binding which can be achieved by overloading of method)
        AdditionDemo obj = new AdditionDemo();
        obj.sum(2,3);
        obj.sum(2,3,4);
        obj.sum(2.3,3.2);


    }
}
