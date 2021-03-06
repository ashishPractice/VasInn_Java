package day13;

public class AccessModifierDemo {

    String defaultVar = "This is default variable";
    public String publicVar = "This is public variable";
    private String privateVar = "This is private variable";
    protected String protectedVar = "This is protected variable";

    void defaultMethod(){
        System.out.println("This is default method");
    }

   public void publicMethod(){
        System.out.println("This is public method");
    }

    private void privateMethod(){
        System.out.println("This is private method");
    }

    protected void protectedMethod(){
        System.out.println("This is protected method");
    }

    public AccessModifierDemo(){
        System.out.println("This is public constructor");
    }

    AccessModifierDemo(int a){
        System.out.println("This is default constructor");
    }

    private AccessModifierDemo(int a, int b){
        System.out.println("This is private constructor");
    }

    protected AccessModifierDemo(String c){
        System.out.println("This is protected constructor");
    }


    public static void main(String[] args) {
        AccessModifierDemo ob = new AccessModifierDemo(4,5);
        ob.defaultMethod();
        ob.publicMethod();
        ob.protectedMethod();
        ob.privateMethod();
    }


}
