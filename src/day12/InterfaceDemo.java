package day12;

public interface InterfaceDemo {

    // by default method in interface are public abstract

    void test1();

    public void test2();

    abstract void test3();

    public abstract void test4();

    // by default variable are public static final
    int A1 = 1;
    public int A2 = 1;
    static int A3 = 1;
    final int A4 = 1;
    public static int A5 = 1;
    public final int A6 = 1;
    static final int A7 = 1;
    public static final int A8 = 1;

    // cannot make constructor


}
