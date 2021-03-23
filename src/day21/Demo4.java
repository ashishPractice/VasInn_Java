// Interface demo
package day21;

public interface Demo4 {

    void m1();

    // After java 8 we can have method body using static or default keyword for backup compatibility
    default void m2(){

    }

    static void m3(){

    }
}
