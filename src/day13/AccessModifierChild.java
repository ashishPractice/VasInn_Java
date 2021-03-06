package day13;

public class AccessModifierChild extends AccessModifierDemo{

    public static void main(String[] args) {
     //   AccessModifierDemo ob = new AccessModifierDemo(4,5); cannot access private within same package
        AccessModifierDemo ob = new AccessModifierDemo(); // public
        AccessModifierDemo ob1 = new AccessModifierDemo(2); // default
        AccessModifierDemo ob2 = new AccessModifierDemo("hello"); // protected

        ob.defaultMethod();
        ob.publicMethod();
        ob.protectedMethod();
      //  ob.privateMethod();  cannot be access within same package
    }
}
