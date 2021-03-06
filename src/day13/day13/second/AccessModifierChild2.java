package day13.day13.second;

import day13.AccessModifierDemo;

public class AccessModifierChild2 extends AccessModifierDemo{

    public static void main(String[] args) {

            //   AccessModifierDemo ob = new AccessModifierDemo(4,5); cannot access private within same package
            AccessModifierDemo ob = new AccessModifierDemo(); // public
            //     AccessModifierDemo ob1 = new AccessModifierDemo(2);  default cannot be access
            //    AccessModifierDemo ob2 = new AccessModifierDemo("hello"); // protected cannot be access

            //    ob.defaultMethod(); default cannot be access
            ob.publicMethod();
            //    ob.protectedMethod();  protected cannot be access
            //  ob.privateMethod();  cannot be access within same package


            // So how to access protected member
            AccessModifierChild2 obj = new AccessModifierChild2();
             obj.protectedMethod();
        }
    }
