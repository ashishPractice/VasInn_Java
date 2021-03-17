package day19;

public class ThreadDemo2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello from thread");
    }

    public static void main(String[] args) {
        ThreadDemo2 t1 = new ThreadDemo2();
        ThreadDemo2 t2 = new ThreadDemo2();
        ThreadDemo2 t3 = new ThreadDemo2();

        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        Thread th3 = new Thread(t3);

        th1.start();
        th2.start();
        th3.start();

    }
}
