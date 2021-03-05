package day12;

// To stop inherit
public /*final*/ class FinalDemo {

    // to declare constant
    final int A;

    public /*final*/ FinalDemo(int A){
        this.A = A;
    }

    // to avoid overridding
    public /*final*/ void sayHello(){
        System.out.println("Hello from parent");
    }



}
